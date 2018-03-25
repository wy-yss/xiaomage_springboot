package com.yss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @Author: com.yss
 * @Description:
 * @Date: Created in 20:28 2018/3/24
 */
@SpringBootApplication
@ServletComponentScan(basePackages = {"com.yss.servlet"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
