package consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @Author: sunss
 * @Date: 2020/10/15 14:41
 * @Version: 1.0
 */
@FeignClient(name = "producer",fallback = ProduceServiceHystrix.class)
public interface ProducerServiceClient {

    @GetMapping("/test")
    String test();

}
