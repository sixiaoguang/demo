package com.example.demo.service.impl;

import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service("service2")
public class UserServiceImpl2 implements UserService {
    @Override
    public int selectUsers() {
        return 2;
    }
}
