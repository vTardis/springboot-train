package com.atguigu.springboot.controller;

import com.atguigu.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizhiwei
 * @create 2020-07-02-9:05
 */

@RestController
public class SpringBootController {

    @Autowired
    User user;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/quick")
    public String quickStart(){

        System.out.println("user = " + user);
        System.out.println("port =" + port);
        return "springboot 启动成功111";
    }

}
