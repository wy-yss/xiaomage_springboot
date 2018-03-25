package com.yss.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: yss
 * @Description:
 * @Date: Created in 13:22 2018/3/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Test
    public void getDescription() {
        User user = new User();
        user.setDescription("{\"province\":\"中国\",\"city\":\"长沙\"}");
        user.setUsername("yss");
        user.setUsername("rootoo");
    }

    @Test
    public void setDescription() {
    }
}