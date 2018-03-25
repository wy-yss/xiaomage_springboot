package com.yss;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: com.yss
 * @Description:
 * @Date: Created in 20:28 2018/3/24
 */
@SpringBootApplication
@MapperScan("com.yss.mapper")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
