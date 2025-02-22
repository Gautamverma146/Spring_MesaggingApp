package com.Capgemini.springintro.controller;

import com.Capgemini.springintro.dto.DtoPost;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/dto")
    public ResponseEntity<DtoPost> dtoPostResponseEntity(@RequestBody DtoPost dtoPost){
        return new ResponseEntity<>(new DtoPost(dtoPost.getFirstName(),dtoPost.getLastName()), HttpStatus.CREATED);
    }
    @PutMapping("/put/{firstName}")
    public String sayHello(
            @PathVariable String firstName,
            @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz!";
    }
}
