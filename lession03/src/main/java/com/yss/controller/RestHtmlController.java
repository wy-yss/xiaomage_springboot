package com.yss.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @Author: yss
 * @Description:
 * @Date: Created in 22:40 2018/3/24
 */
@RestController
public class RestHtmlController {
    /**
     * 返回html测试
     * @return 返回网页
     */
    @GetMapping({"/html/demo", "/html/demo2"})
    public String htmlCode() {
        return "<h1>hello</h1>";
    }

    @GetMapping("/html/demo/{message}")
    public String htmlCodePathVariable(@PathVariable String message) {
        return "<h1>hello\t" + message + "</h1>";
    }

    @GetMapping("/html/demo3")
    public String htmlCode(String message) {
        return "<h1>hello\t" + message + "</h1>";
    }

    @GetMapping("/html/demo/header")
    public String htmlCodeHeader(@RequestHeader String Accept) {
        return "<h1>hello\t" + Accept + "</h1>";
    }

    @GetMapping("/html/demo/respEntity")
    public ResponseEntity<String> htmlCodeRespEntity() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.put("myHeader", Arrays.asList("myHeaderValue"));
        return new ResponseEntity<>("hello is respEntityBody", httpHeaders, HttpStatus.OK);
    }
}
