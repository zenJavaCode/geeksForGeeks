package com.example.finalUrl.controller;

import com.example.finalUrl.common.Constants;
import com.example.finalUrl.model.URL;
import com.example.finalUrl.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.UUID;

@RestController
public class UrlController {

    @Autowired
    UrlService urlService;

       @GetMapping("/ping")
    public String pingMe() {
        return "pong";
    }

    @PostMapping("/submitUrl")
    public ResponseEntity<Void> submitUrl(@RequestBody URL url){
           url.setId(Constants.URL_PREFIX  +UUID.randomUUID().toString());
           urlService.save(url);
        System.out.println(url);
        return ResponseEntity.ok().build();
        
    }

    
}
