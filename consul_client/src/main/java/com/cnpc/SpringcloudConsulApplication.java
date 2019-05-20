package com.cnpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run( SpringcloudConsulApplication.class, args );
    }

}
