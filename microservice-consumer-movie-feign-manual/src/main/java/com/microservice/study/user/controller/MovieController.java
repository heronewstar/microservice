package com.microservice.study.user.controller;

import com.microservice.config.FeignConfiguration;
import com.microservice.study.user.pojo.User;
import com.microservice.study.user.service.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Import(FeignConfiguration.class)
public class MovieController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        return this.userFeignClient.findById(id);
    }

}
