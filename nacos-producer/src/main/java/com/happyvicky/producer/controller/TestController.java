package com.happyvicky.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: sunss
 * @Date: 2020/10/15 14:42
 * @Version: 1.0
 */
@RestController
public class TestController {

    @GetMapping("test")
    public String test(){
        return "Consumer call ok!!!";
    }
}
