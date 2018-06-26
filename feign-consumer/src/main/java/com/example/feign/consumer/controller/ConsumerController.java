package com.example.feign.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @GetMapping(value="/feign-consumer")
    public String hello(){
        return "feign-consumer";
    }
}
