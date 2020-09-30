package com.wsw.springbootquartz.service.impl;

import com.wsw.springbootquartz.dao.UserRepository;
import com.wsw.springbootquartz.entity.User;
import com.wsw.springbootquartz.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Author WangSongWen
 * @Date: Created in 9:39 2020/9/29
 * @Description: 业务实现类
 */
@Service
@CacheConfig(cacheNames = "user")
public class JobServiceImpl implements JobService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void sayHello() {
        System.out.println("Hello World");
    }

    @Override
    @Cacheable(key = "#username")
    public User findUserByUserName(String username) {
        return userRepository.findUserByUsername(username);
    }
}
