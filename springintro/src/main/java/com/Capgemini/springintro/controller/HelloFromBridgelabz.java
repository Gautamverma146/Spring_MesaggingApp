package com.Capgemini.springintro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloFromBridgelabz {
    @GetMapping("/hello")
    public String hello(){
        return "Hello From Bridgelabz";
    }
}
