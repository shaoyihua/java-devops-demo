package com.itheigougou.javadevopsdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDevops {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Devops";
    }
}
