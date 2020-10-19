package consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import consumer.feign.ProducerServiceClient;

/**
 * @Description:
 * @Author: sunss
 * @Date: 2020/10/15 14:42
 * @Version: 1.0
 */
@RestController
public class TestController {

    @Autowired
    ProducerServiceClient producerServiceClient;

    @GetMapping("callProducer")
    public String callProducer(){
        return producerServiceClient.test();
    }


}
