package com.cnpc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudConsulApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder( SpringcloudConsulApplication.class ).web( true ).run( args );
    }

}
