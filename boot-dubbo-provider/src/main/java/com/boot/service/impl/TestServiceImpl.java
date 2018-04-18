package com.boot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.boot.domain.User;
import com.boot.service.TestService;
import org.springframework.stereotype.Component;


@Component
@Service()
public class TestServiceImpl implements TestService {

    @Override
    public String sayHello(String name) {
        return "你好, "+name;
    }

    @Override
    public User findUser() {
        User user = new User();
        user.setId(1001);
        user.setName("scott");
        user.setPassword("tiger");
        user.setAge(20);
        user.setGender(0);
        return user;

    }
}
