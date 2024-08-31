package com.bway.serviceb.controller;

import com.bway.serviceb.util.FeignServiceBUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-B")
public class ServiceBController {
    @Autowired
    private FeignServiceBUtil feignServiceBUtil;

    @GetMapping("/messageB")
    public String getBMessage(){
        return feignServiceBUtil.getMessageB()+" This is the message of B";
    }

}
