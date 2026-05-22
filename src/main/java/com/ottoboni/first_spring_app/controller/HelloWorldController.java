package com.ottoboni.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
    //post, get, delete, put, patch, options, head

    @GetMapping()
    public String helloWorld() {
        return "Hello World!";
    }

}
