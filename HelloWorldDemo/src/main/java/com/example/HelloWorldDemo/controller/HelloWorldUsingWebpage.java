package com.example.HelloWorldDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldUsingWebpage {

    @GetMapping("/web")
    public String index() {
        return "hello";
    }
}
