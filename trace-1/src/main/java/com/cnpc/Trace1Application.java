package com.cnpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class Trace1Application {

    public static final Logger log = LoggerFactory.getLogger( Trace1Application.class );

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @RequestMapping(value = "/trace-1",method = RequestMethod.GET)
    public String trace(){
        log.info( "~~~~trace-1~~~~~~" );
        return restTemplate().getForEntity( "http://trace/trace-2",String.class ).getBody();
    }

    public static void main(String[] args) {
        SpringApplication.run( Trace1Application.class, args );
    }

}
