package com.wsw.springbootquartz.config;

import com.wsw.springbootquartz.job.ApiJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author WangSongWen
 * @Date: Created in 9:46 2020/9/29
 * @Description: 调度工厂、调度实例
 */
@Configuration
public class QuartzConfig {
    @Bean
    public JobDetail myJobDetail(){
        return JobBuilder.newJob(ApiJob.class)
                .withIdentity("myJobDetail", "myJobDetailGroup").storeDurably()
                .withDescription("测试")
                .build();
    }

    @Bean
    public Trigger myTrigger(){
        return TriggerBuilder.newTrigger().forJob(myJobDetail())
                .withIdentity("myTrigger", "myTriggerGroup")
                .withSchedule(CronScheduleBuilder.cronSchedule("0/10 * * * * ?"))  // corn表达式---10秒执行一次
                .build();
    }
}
