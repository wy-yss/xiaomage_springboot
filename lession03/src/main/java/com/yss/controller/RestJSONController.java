package com.yss.controller;

import com.yss.domain.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 *
 */
@RestController
@RequestMapping("/JSON")
public class RestJSONController {
    @GetMapping(value = "/user",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getUsers() {
        return Arrays.asList(new User("yss", "rootoo"), new User("yang", "杨"));
    }
}
