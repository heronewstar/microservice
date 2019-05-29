package com.microservice.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Feign的配置类
@Configuration
public class FeignConfiguration {

     @Bean
     public Contract feignContract(){
         return new feign.Contract().Default();
     }
}
