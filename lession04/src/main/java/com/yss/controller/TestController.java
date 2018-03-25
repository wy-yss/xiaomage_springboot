package com.yss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yss
 * @Description:
 * @Date: Created in 1:21 2018/3/25
 */
@RestController
public class TestController {
    @GetMapping("/myServlet")
    public String test1() {
        return "myServelt";
    }
}
