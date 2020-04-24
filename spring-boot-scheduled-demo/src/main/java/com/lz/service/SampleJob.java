package com.lz.service;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * 〈测试定时框架Quartz〉
 *
 * @author LZ
 * @create 2020/4/24
 * @since 1.0.0
 */
public class SampleJob extends QuartzJobBean {



    @Override
    protected void executeInternal(JobExecutionContext context)
            throws JobExecutionException {
        System.out.println("测试定时框架Quartz");
    }

}
