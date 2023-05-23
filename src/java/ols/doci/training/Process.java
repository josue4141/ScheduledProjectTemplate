package ols.doci.training;

import com.consumoApi.ConsumoApi;
import com.generacionExcel.CargarExcel;
import ols.doci.env.Log;
import com.generacionExcel.GenerarJson;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import ols.doci.env.EnvLoader;
import org.xml.sax.SAXException;

/**
 *
 * @author Luis Brayan
 */
public class Process {

    protected boolean debug = false;
    protected String ruta = "";
    public Process(boolean debug) {
        Log.log("Process instance created");

        this.debug = debug;
    }

    public void InitProcess() {
        GenerarJson generarJson = new GenerarJson();
        CargarExcel ce = new CargarExcel();
        ConsumoApi api = new ConsumoApi();
        try {
            EnvLoader env = new EnvLoader();
            this.ruta = env.getString("ruta", "rutaArchivo");
            ce.cargarExcel(this.ruta);
            generarJson.generarJsonCosumidorFinal();
            generarJson.generarJsonCreditoFiscal();
            api.Consumir();
            Log.formatedError("Consumir web service {0} {1}", "placeholder-1", true);
        } catch (IOException | ParserConfigurationException | SAXException | NullPointerException ex) {
            
        }
        

    }
}
