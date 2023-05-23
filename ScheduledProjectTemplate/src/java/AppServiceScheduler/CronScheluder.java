/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppServiceScheduler;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 *
 * @author Pedro Mira
 */
public class CronScheluder {
    public static int id_g=0;
    public static int id_itemnum=0;

    public CronScheluder(int intervalInMinutes) throws Exception{
        try {
            // specify the job' s details..
            JobDetail job = JobBuilder.newJob(ProcesamientoJob.class)
                .withIdentity("initProcJob")
                .build();

            // specify the interval
            SimpleScheduleBuilder scheduler = SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInMinutes(intervalInMinutes)
                .repeatForever();

            // specify the running period of the job
            Trigger trigger = TriggerBuilder.newTrigger()
                .withSchedule(scheduler)
                .build();

            //schedule the job
            SchedulerFactory schFactory = new StdSchedulerFactory();
            Scheduler sch = schFactory.getScheduler();
            sch.start();
            sch.scheduleJob(job, trigger);
        } catch (SchedulerException ex) {
            Logger.getLogger(CronScheluder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
