package com.happyvicky.config.service;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: sunss
 * @Date: 2020/10/12 16:10
 * @Version: 1.0
 */
@RefreshScope
@Service
public class RockectMQService {

    @Value("${spring.application.env}")
    String env;

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    public void sendMQ(String topic, Object msg){
        topic = getTopic(topic);
        System.out.println("topic=" + topic + "; msg=" + msg);
        rocketMQTemplate.convertAndSend(topic, msg);

    }

    private String getTopic(String topic){
        topic = topic.replace("${spring.application.env}", env);
        return topic;
    }


}
