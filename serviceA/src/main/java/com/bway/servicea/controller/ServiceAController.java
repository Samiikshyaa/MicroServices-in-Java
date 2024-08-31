package com.bway.servicea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-A")
public class ServiceAController {
    @GetMapping("/message")
    public String showMessage(){
        return "Hello World!";
    }
}
