package com.fei.zkdemo.springbootzkconsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fei.zkdemo.springbootzkproducter.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Reference
    OrderService orderService;

    public String showOrder(){
        String s = orderService.showOrder();
        return s+"world";
    }
}
