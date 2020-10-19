package consumer.feign;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: sunss
 * @Date: 2020/10/15 14:41
 * @Version: 1.0
 */
@Component
public class ProduceServiceHystrix implements ProducerServiceClient {

    @Override
    public String test() {
        return "请求超时了";
    }
}
