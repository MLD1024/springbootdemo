package com.lz.service;

import lombok.extern.log4j.Log4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

/**
 * 〈定时任务〉
 *
 * @author LZ
 * @create 2020/4/24
 * @since 1.0.0
 */
@Component
public class ScheduledTask {

    @Scheduled(cron = "0/5 * * * * *")
    public void Hello() {
        System.out.println("hello world");
    }

}
