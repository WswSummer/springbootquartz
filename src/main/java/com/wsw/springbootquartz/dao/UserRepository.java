package com.wsw.springbootquartz.dao;

import com.wsw.springbootquartz.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author WangSongWen
 * @Date: Created in 14:02 2020/9/30
 * @Description:
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByUsername(String username);
}
