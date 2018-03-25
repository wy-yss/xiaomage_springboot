package com.yss.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

/**
 * @Author: yss
 * @Description:
 * @Date: Created in 17:17 2018/3/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMapperTest {

    @Autowired
    OrderMapper orderMapper;

    @Test
    public void insert() {
        orderMapper.insert(1, 2);
    }

    @Test
    public void inserts() {
        orderMapper.inserts(2, Arrays.asList(1, 3));
    }
}