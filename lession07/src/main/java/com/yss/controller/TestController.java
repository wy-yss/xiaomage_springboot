package com.yss.controller;

import com.yss.domain.User;
import com.yss.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yss
 * @Description:
 * @Date: Created in 1:21 2018/3/25
 */
@RestController
@RequestMapping("/user")
public class TestController {

    @Autowired
    UserMapper userMapper;

    /**
     * 增加用户
     * @param user 用户属性
     */
    @PostMapping("")
    public void saveUser(User user) {
        userMapper.insert(user);
    }
}
