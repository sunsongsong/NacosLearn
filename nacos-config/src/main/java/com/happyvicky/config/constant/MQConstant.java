package com.happyvicky.config.constant;

/**
 * @Description:
 * @Author: sunss
 * @Date: 2020/10/13 16:16
 * @Version: 1.0
 */
public class MQConstant {

    public static final String TOPIC_PREFIX = "${spring.application.env}_";
    public static final String CONSUMER_GROUP_SUFFIX = "_consumer_group";

    /**
     * test 队列
     */
    public static final String TOPIC_TEST = TOPIC_PREFIX + "ok";
    public static final String TOPIC_TEST_CONSUMER_GROUP = TOPIC_TEST + CONSUMER_GROUP_SUFFIX;

    /**
     * test2 队列
     */
    public static final String TOPIC_TEST2 = TOPIC_PREFIX + "ok2";
    public static final String TOPIC_TEST_CONSUMER_GROUP2 = TOPIC_TEST2 + CONSUMER_GROUP_SUFFIX;


}
