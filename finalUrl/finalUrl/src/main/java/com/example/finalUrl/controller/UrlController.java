package com.example.finalUrl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {

       @GetMapping("/ping")
    public String pingMe(){
        return "pong";
    }

    @PostMapping("/submitUrl")
    public void submitUrl(@RequestBody String url){
        System.out.println(url);
        
    }

    
}
