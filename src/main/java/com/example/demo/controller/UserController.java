package com.example.demo.controller;

import com.example.demo.service.UserService;
import com.example.demo.utils.ApplicationContextAwareImpl;
import com.example.demo.utils.ToolClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class UserController {

    //final String str = "service2";

    @Autowired
    @Qualifier(ToolClass.str)
    UserService userService;

    @Value("${service.name}")
    private String serviceName;

    @RequestMapping(value="/user",method = RequestMethod.GET)
    @ResponseBody
    String login(){
        UserService userServiceAAA = (UserService)ApplicationContextAwareImpl.getApplicationContext().getBean(serviceName);
        return "userService=========="+userServiceAAA.selectUsers();
    }
}
