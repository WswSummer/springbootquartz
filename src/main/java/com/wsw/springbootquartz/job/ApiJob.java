package com.wsw.springbootquartz.job;

import com.wsw.springbootquartz.service.JobService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @Author WangSongWen
 * @Date: Created in 17:31 2020/9/28
 * @Description: 实现定时功能的接口：如定时推送信息等
 */
@Slf4j
public class ApiJob implements Job {
    @Autowired
    private JobService jobService;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info(new Date() + " -> 业务代码执行...");
        try {
            // 业务代码执行
            jobService.sayHello();
        } catch (Exception e) {
            log.info(new Date() + " -> 执行异常 " + e.getMessage());
        }
        log.info(new Date() + " -> 执行完成");
    }
}
