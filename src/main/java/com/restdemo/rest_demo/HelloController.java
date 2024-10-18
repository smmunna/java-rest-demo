package com.restdemo.rest_demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {
    @GetMapping("/")
    public String hello(){
        return "Hello from Spring Boot!";
    }
}
