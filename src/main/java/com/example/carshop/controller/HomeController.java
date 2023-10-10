package com.example.carshop.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
@CrossOrigin("http://localhost:4200/")
public class HomeController {
    @GetMapping("/")
    public String carshop() {
        return "index.html";
    }
}
