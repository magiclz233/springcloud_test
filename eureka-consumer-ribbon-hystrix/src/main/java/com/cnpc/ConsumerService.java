package com.cnpc;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ConsumerService
 * @Description TODO
 * @Author magic_罗璋
 * @Date 2019/5/21 17:01
 * @Version 1.0
 **/
@Service
public class ConsumerService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallBack")
    public String consumer(){
        return restTemplate.getForObject( "http://eureka-client/dc",String.class );
    }

    public String fallBack(){
        return "fallBack";
    }
}
