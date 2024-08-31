package com.bway.serviceb.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "serviceA", url = "http://service-a:9000")
public interface FeignServiceBUtil {
    @GetMapping("/service-A/message")
    public String getMessageB();
}
