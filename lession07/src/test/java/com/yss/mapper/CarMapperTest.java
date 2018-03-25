package com.yss.mapper;

import com.yss.domain.Car;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

/**
 * @Author: yss
 * @Description:
 * @Date: Created in 17:02 2018/3/25
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CarMapperTest {
    @Autowired
    CarMapper carMapper;

    @Test
    public void insert() {
    }

    @Test
    public void inserts() {
        carMapper.inserts(Arrays.asList(new Car("bmw", (float) 150000), new Car("本次", (float) 250000)));
    }
}