package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Questioncontroller {

    @GetMapping("/")
    public String getAllquestions(){
        return "this is your question";
    }

}
