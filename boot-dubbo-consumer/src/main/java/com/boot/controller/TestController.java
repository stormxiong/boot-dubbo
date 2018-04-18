package com.boot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.boot.domain.User;
import com.boot.service.TestService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Reference()
    private TestService testService;



    @GetMapping("/hello")
    @ApiOperation(value = "测试接口",notes = "")
    public String hello(){
        return testService.sayHello("SpringBoot and Dubbo");
    }

    @GetMapping("/user")
    @ApiOperation(value = "获取用户信息",notes = "获取全部用户信息")
    public User user(){
        return testService.findUser();
    }
} 
