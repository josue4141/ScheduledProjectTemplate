/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.consumoApi;

import AppServiceScheduler.StartService;
import com.conexionApi.ApiToJsonProcessor;
import com.google.gson.JsonArray;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import ols.doci.env.EnvLoader;
import org.xml.sax.SAXException;

/**
 *
 * @author josue
 */
public class ConsumoApi {
    protected String ruta= "";
    protected String archivo= "";
    
    public void Consumir() throws ParserConfigurationException, SAXException, IOException {
        ApiToJsonProcessor conexionApi = new ApiToJsonProcessor();
        JsonArray result = conexionApi.requestPendingEntries();
        LocalDateTime fechaActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("SSS");
        String fechaActualFormato = fechaActual.format(formato);
        try {
            // usando una instancia
            EnvLoader env = new EnvLoader();
            this.ruta = env.getString("ruta", "outputFilePath");
            this.archivo = env.getString("archivo", "type");

        } catch (IOException | ParserConfigurationException | SAXException | NullPointerException ex) {
            Logger.getLogger(StartService.class.getName()).log(Level.SEVERE, null, ex);
        }

        String outputFilePath = this.ruta + fechaActualFormato + this.archivo;
        System.out.println("este se ejecuta "+ outputFilePath);
        try (FileWriter fileWriter = new FileWriter(outputFilePath)) {
            fileWriter.write(result.toString());
            fileWriter.flush();
        } catch (Exception ex) {
            Logger.getLogger(ConsumoApi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
