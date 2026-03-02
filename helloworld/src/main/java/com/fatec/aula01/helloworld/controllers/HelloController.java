package com.fatec.aula01.helloworld.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/hello")

public class HelloController {
    
    @GetMapping
    public String hello(){
        return "Hello, World!";
    }
}