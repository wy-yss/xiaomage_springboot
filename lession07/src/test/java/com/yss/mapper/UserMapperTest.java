package com.yss.mapper;

import com.yss.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: yss
 * @Description:
 * @Date: Created in 12:49 2018/3/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void selectDescriptionById() {
        String s = userMapper.selectDescriptionById(1);
        System.out.println(s);
    }

    @Test
    public void selectById() {
        User user = userMapper.selectById(1);
        System.out.println(user);
    }
}