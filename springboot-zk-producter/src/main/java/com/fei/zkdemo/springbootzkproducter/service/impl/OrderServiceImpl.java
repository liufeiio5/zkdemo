package com.fei.zkdemo.springbootzkproducter.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fei.zkdemo.springbootzkproducter.service.OrderService;
import org.springframework.stereotype.Component;

@Service
@Component
public class OrderServiceImpl implements OrderService {

    @Override
    public String showOrder() {
        return "hello";
    }
}
