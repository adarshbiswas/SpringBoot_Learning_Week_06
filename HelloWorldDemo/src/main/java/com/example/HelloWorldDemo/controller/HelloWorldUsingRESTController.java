package com.example.HelloWorldDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldUsingRESTController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}
