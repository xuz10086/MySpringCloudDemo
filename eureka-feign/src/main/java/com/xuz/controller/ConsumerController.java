package com.xuz.controller;

import com.xuz.service.FeignServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private FeignServiceClient feignServiceClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(Integer a, Integer b) {
        return feignServiceClient.add(a, b);
    }
}
