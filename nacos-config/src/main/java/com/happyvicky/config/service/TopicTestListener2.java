package com.happyvicky.config.service;

import com.happyvicky.config.constant.MQConstant;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author sunss
 */
@Component
@RocketMQMessageListener(consumerGroup = MQConstant.TOPIC_TEST_CONSUMER_GROUP2, topic = MQConstant.TOPIC_TEST2)
public class TopicTestListener2 implements RocketMQListener<Object> {

    @Override
    public void onMessage(Object object) {
        System.out.println("TopicTestListener2 onMessage... body:" + object.toString());
    }

}