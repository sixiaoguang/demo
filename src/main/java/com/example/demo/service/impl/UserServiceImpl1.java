package com.example.demo.service.impl;

import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service("service1")
public class UserServiceImpl1 implements UserService {

    @Override
    public int selectUsers() {
        return 1;
    }
}
