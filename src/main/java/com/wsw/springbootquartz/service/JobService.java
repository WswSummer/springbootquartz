package com.wsw.springbootquartz.service;

import com.wsw.springbootquartz.entity.User;

/**
 * @Author WangSongWen
 * @Date: Created in 9:38 2020/9/29
 * @Description:
 */
public interface JobService {
    void sayHello();

    User findUserByUserName(String username);
}
