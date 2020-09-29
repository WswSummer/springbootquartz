package com.wsw.springbootquartz.service.impl;

import com.wsw.springbootquartz.service.JobService;
import org.springframework.stereotype.Service;

/**
 * @Author WangSongWen
 * @Date: Created in 9:39 2020/9/29
 * @Description:
 */
@Service
public class JobServiceImpl implements JobService {
    @Override
    public String helloWorld() {
        return "Hello World";
    }
}
