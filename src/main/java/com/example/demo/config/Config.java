package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {
    final String str = "service2";


    //@Bean"service2";
    public String button() {
        return str;
    }
}
