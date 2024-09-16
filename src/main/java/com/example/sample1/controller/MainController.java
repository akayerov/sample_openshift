package com.example.sample1.controller;


import jakarta.annotation.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/hello")
    String sayHello(@RequestParam @Nullable String name) {
        if(name != null)
          return "Hello " + name;
        else
          return "Hello everyone";


    }
}
