package com.bway.servicec.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="serviceB", url = "http://service-b:9001")
public interface FeignServiceCUtil {
    @GetMapping("/service-B/messageB")
    public String getMessageC();
}
