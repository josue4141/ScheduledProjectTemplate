/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppServiceScheduler;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;

/**
 *
 * @author Pedro Mira
 */
public class ProcesamientoJob implements Job {
    @Override
    public void execute(JobExecutionContext jExeCtx) throws JobExecutionException {
        System.out.println("Inicia Schedule");
        SchedulerFactory schFactory = new StdSchedulerFactory();
        int id = CronScheluder.id_g;

        try {
            Scheduler sch = schFactory.getScheduler();
            // inicia el procesamiento
            StartService startProc = new StartService();
            startProc.InitProcesamiento(id);

        } catch (SchedulerException ex) {
            Logger.getLogger(ProcesamientoJob.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ProcesamientoJob.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
