package com.microservice.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoverEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoverEurekaApplication.class, args);
    }

}
