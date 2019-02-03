package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
    
    @RequestMapping("/helloAgain")
    public String helloAgain(){
        return "hello world";
    }
}
