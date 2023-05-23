/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conexionApi;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import ols.doci.env.EnvLoader;
import ols.doci.env.Log;
import org.xml.sax.SAXException;

/**
 *
 * @author josue
 */
public class ApiToJsonProcessor {

    protected boolean debug = false;
    protected String docsField = "";
    protected String endpoint = "";
    protected String method = "";

    public JsonArray requestPendingEntries()  {

        OkHttpClient client = new OkHttpClient().newBuilder().build();

        EnvLoader env;
        try {
            env = new EnvLoader();
            this.debug = env.getBoolean("processor", "debug");
            this.endpoint = env.getString("source-api", "endpoint");
            this.method = env.getString("met", "method");
            this.docsField = env.getString("doc", "docsField");
        }catch (IOException | ParserConfigurationException | SAXException | NullPointerException ex) {
            Logger.getLogger(ApiToJsonProcessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        //MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                .addFormDataPart("fechainicio", "2023-04-27")
                .addFormDataPart("fechafin", "2023-04-27")
                .build();

        Request request = new Request.Builder()
                .url(this.endpoint)
                .method(this.method, body)
                .build();

        try {
            // TODO: add usage of metadata in the request response
            // TODO: add control of bad responses
            Response response = client.newCall(request).execute();
            ResponseBody rBody = response.body();
            if (rBody == null) {
                Log.error("Request response should include a json-string body.");
                return new JsonArray();
            }

            String jsonString = rBody.string();
            if (debug) {
                Log.formatedDebug("Requested data <{0}>", jsonString);
            }

            JsonElement je = JsonParser.parseString(jsonString);
            if (!je.isJsonObject()) {
                Log.error("Requested data should be a JsonObject");
                return new JsonArray();
            }

            JsonObject jo = je.getAsJsonObject();
            if (!jo.has(this.docsField)) {
                Log.formatedError("Requested data doesn't contains <{0}>", docsField);
                return new JsonArray();
            }

            JsonElement ja = jo.get(this.docsField);
            if (!ja.isJsonArray()) {
                Log.formatedError("Requested data <{0}> should be a JsonArray", docsField);
                return new JsonArray();
            }

            return (JsonArray) ja;
        } catch (IOException ex) {
            Logger.getLogger(ApiToJsonProcessor.class.getName()).log(Level.SEVERE, null, ex);
        }

        return new JsonArray();
    }
}
