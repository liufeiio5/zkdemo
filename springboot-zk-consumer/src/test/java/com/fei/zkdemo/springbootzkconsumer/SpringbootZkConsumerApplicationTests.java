package com.fei.zkdemo.springbootzkconsumer;

import com.fei.zkdemo.springbootzkconsumer.service.UserService;
import com.fei.zkdemo.springbootzkproducter.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootZkConsumerApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void testZkCnnection() {
        System.out.println(userService.showOrder());
    }

}
