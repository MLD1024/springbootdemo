package com.lz.config;

import com.lz.service.SampleJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈QuartzConfig 配置〉
 *
 * @author LZ
 * @create 2020/4/24
 * @since 1.0.0
 */
@Configuration
public class QuartzConfig {
    @Bean
    public JobDetail createJob() {
        return JobBuilder.newJob(SampleJob.class).storeDurably().build();
    }

    @Bean
    public Trigger trigger1() {
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(1) //每一秒执行一次
                .repeatForever(); //永久重复，一直执行下去
        return TriggerBuilder.newTrigger()
                .forJob(createJob())
                .withSchedule(scheduleBuilder)
                .build();
    }


}
