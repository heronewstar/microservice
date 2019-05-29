package com.microservice.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;

@Configuration
public class FooConfiguration {

    @Bean
    public BasicAuthorizationInterceptor basicAuthorizationInterceptor(){
         return new BasicAuthorizationInterceptor("user","password");
    }
}
