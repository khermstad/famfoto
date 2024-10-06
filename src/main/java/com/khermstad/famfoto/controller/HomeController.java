package com.khermstad.famfoto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getHome(){
        return "Hello World. The time at the request was: " + ZonedDateTime.now();
    }

    @GetMapping("/login")
    public String getLogin(){
        return "Hello World LOGIN PAGE. The time at the request was: " + ZonedDateTime.now();
    }
}
