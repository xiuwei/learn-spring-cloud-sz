package com.example.feign.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("hello-service")
public interface HelloService {

    @RequestMapping(value = "/hello/jack/")
    String hello();
}
