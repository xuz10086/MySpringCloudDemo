package com.xuz.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class FeignServiceClientHystrix implements FeignServiceClient {
    @Override
    public Integer add(@RequestParam(value = "a") Integer a,
                       @RequestParam(value = "b") Integer b) {
        return -999999;
    }
}
