package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Questioncontroller {

    @GetMapping("/")
    public String getAllquestions(){
        return "this is your question";
    }

}
