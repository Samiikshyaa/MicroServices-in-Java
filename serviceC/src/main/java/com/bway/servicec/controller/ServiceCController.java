package com.bway.servicec.controller;

import com.bway.servicec.util.FeignServiceCUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-C")
public class ServiceCController {
    @Autowired
    private FeignServiceCUtil feignServiceCUtil;

    @GetMapping("/messageC")
    public String getCMessage() {
        return feignServiceCUtil.getMessageC() + " This is the message of C as well";
    }

}
