package com.ual.document.services.implementation;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.ual.document.services.ReminderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

    ReminderRepository reminderRepository;
    ReminderService reminderService;

        private final Logger log = LoggerFactory.getLogger(Scheduler.class);

        private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        private final ReminderService event = new ReminderService();


        //@Scheduled(fixedRate = 5000)
        @Scheduled(cron = "0/05 * * * * ?")
        public void reportCurrentTime() {

           // log.info("The event is in two hours get Ready!!", event.remindByDate("2023-10-10 12:00:00"));
            log.info("The time is now {}", dateFormat.format(new Date()));
            System.out.println("run");

            //System.out.println(reminderRepository.getDateGreaterThanCurrentTime("20", String.valueOf(DATETIME)));
            /*if(
                    Instant
                            .parse( "2022-04-23 04:55:00" )
                            .isAfter(
                                    Instant.now()
                            )
            ){
                System.out.println("testing after current time");
            }
*/
    }
}





