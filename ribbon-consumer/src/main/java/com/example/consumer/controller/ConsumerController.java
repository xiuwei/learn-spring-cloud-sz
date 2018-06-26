package com.example.consumer.controller;

import com.example.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/ribbon-consumer")
    public String hello(){
        return helloService.hello();
    }
}
