package com.wsw.springbootquartz.job;

import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * @Author WangSongWen
 * @Date: Created in 17:31 2020/9/28
 * @Description: 实现定时功能的接口：如定时推送信息等
 */
@Slf4j
public class ApiJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info(new Date() + "正在执行...");
    }
}
