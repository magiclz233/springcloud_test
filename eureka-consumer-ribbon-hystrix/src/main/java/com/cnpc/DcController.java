package com.cnpc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class DcController {


    @Autowired
   ConsumerService consumerService;

    @GetMapping("/consumer")
    public String dc() {

        return consumerService.consumer();
    }

}
