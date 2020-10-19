package com.happyvicky.config.controller;

import com.happyvicky.config.constant.MQConstant;
import com.happyvicky.config.service.RockectMQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: sunss
 * @Date: 2020/10/12 16:16
 * @Version: 1.0
 */
@RefreshScope
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    RockectMQService rockectMQService;

    @GetMapping("/send")
    public String send(String id){
        System.out.println("id="+id);
        rockectMQService.sendMQ(MQConstant.TOPIC_TEST, id);
        return "ok";
    }

    @GetMapping("/send2")
    public String send2(String id){
        System.out.println("id="+id);
        rockectMQService.sendMQ(MQConstant.TOPIC_TEST2, id);
        return "ok";
    }

    @Value("${spring.application.env}")
    String env;

    @GetMapping("/getEnv")
    public String getEnv(){
        return env;
    }

}
