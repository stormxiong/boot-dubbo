package com.boot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.boot.domain.User;
import com.boot.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Reference()
    private TestService testService;



    @GetMapping("/hello")
    public String hello(){
        return testService.sayHello("SpringBoot and Dubbo");
    }

    @GetMapping("/user")
    public User user(){
        return testService.findUser();
    }
} 
