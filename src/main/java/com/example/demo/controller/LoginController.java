package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//abc
@RequestMapping(value="/app")
@Controller
public class LoginController {

    @RequestMapping(value="/login",method = RequestMethod.GET)
    @ResponseBody
    String login(){
        return "登录成功,YES-1-2-4---666-777--888-sss--1";
    }
}
