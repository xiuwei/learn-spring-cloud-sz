package com.example.feign.consumer.controller;

import com.example.feign.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private HelloService helloService;

    @GetMapping(value="/feign-consumer")
    public String hello(){
        return helloService.hello();
    }
}
