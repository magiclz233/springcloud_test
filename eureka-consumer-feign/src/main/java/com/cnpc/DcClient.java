package com.cnpc;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName DcClient
 * @Description TODO
 * @Author magic_罗璋
 * @Date 2019/5/21 10:21
 * @Version 1.0
 **/
@FeignClient("eureka-client")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();
}
