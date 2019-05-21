package com.cnpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class EurekaFeignUplaodServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder( EurekaFeignUplaodServerApplication.class ).web( true ).run( args );
    }

}
