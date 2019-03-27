package com.fei.zkdemo.springbootzkconsumer.controller;

import com.fei.zkdemo.springbootzkconsumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    UserService userService;

    @RequestMapping("/invoke")
    @ResponseBody
    public String show(){
        return userService.showOrder();
    }
}
