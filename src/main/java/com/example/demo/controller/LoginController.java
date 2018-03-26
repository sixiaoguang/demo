package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(value="/app")
@Controller
public class LoginController {

    @RequestMapping(value="/login",method = RequestMethod.GET)
    @ResponseBody
    String login(){
        return "登录成功,YES-2";
    }
}
