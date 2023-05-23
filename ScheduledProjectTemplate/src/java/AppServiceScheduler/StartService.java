/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppServiceScheduler;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServlet;
import javax.xml.parsers.ParserConfigurationException;
import ols.doci.env.EnvLoader;
import ols.doci.env.Log;
import ols.doci.training.Process;
import org.xml.sax.SAXException;

/**
 *
 * @author Pedro Mira
 */
public class StartService extends HttpServlet {
    protected boolean debug = false;
    protected int interval = 5;

    @Override
    public void init() {
        try {
            Logger.getLogger(StartService.class.getName()).log(Level.INFO, "Iniciando ******* SERVICIO*******");
            this.loadConfiguration();
            
            CronScheluder scheduler = new CronScheluder(this.interval);
            Logger.getLogger(StartService.class.getName()).log(Level.INFO, "Service Initialized successfully");
        } catch (Exception ex) {
            Logger.getLogger(StartService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    protected boolean loadConfiguration() {
        try {
            // usando el metodo estatico
            //this.debug = EnvLoader.getSingleBoolean("processor", "debug");
            //this.interval = EnvLoader.getSingleInt("processor", "intervalInMinutes");

            // usando una instancia
            EnvLoader env = new EnvLoader();
            this.debug = env.getBoolean("processor", "debug");
            this.interval = env.getInt("processor", "intervalInMinutes");

            return true;
        } catch (IOException | ParserConfigurationException | SAXException | NullPointerException ex) {
            Logger.getLogger(StartService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public void InitProcesamiento(int id) throws Exception {
        Logger.getLogger(StartService.class.getName()).log(Level.INFO, "Init procesamiento con id {0}", id);
        if (id < 1) {
            CronScheluder.id_g++;
            return;
        }

        Log.log("****** PROCESS STARTED ******");

        Process module = new Process(this.debug);
        module.InitProcess();

        Log.log("****** PROCESS ENDED ******");
    }
}
