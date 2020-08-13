package com.example25.demo_onetomany25.config;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwaggerDemo {

    @GetMapping(value="/books")
    public HashMap<String, String> getAuthorBooks(){
        HashMap<String, String> response = new HashMap<>();
        response.put("id", "987");
        response.put("Author's name", "Mangazie");
        response.put("Book's name", "Ma vie");
        return response;
    }
    
}