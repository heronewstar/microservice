package com.microservice.study.user.service;


import com.microservice.config.FeignConfiguration;
import com.microservice.study.user.pojo.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;



public interface UserFeignClient {

    //@RequestMapping(value = "/{id}" ,method = RequestMethod.GET)
    //public User findById(@PathVariable("id") Long id);

    //使用feign自带的注解@RequestLine
    @RequestLine("GET /{id}")
    public User findById(@Param("id") Long id);

}
