package com.Capgemini.springintro.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloFromBridgelabz {
    @GetMapping("/hello")
    public String hello(){
        return "Hello From Bridgelabz";
    }

    @GetMapping("/hello/query")
    public String sayHello(@RequestParam(value = "name",defaultValue = "user") String name){
        return "Hello" + name + "From Bridgelabz";
    }

    @GetMapping("hello1/{name}")
    public ResponseEntity<String> hello1(@PathVariable("name")String name){
        return new ResponseEntity<>("Hello  " + name + " from BridgeLabz", HttpStatus.OK );
    }
}
