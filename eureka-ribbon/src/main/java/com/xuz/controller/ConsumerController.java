package com.xuz.controller;

import com.xuz.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    ConsumerService consumerService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Integer a, Integer b) {
        return consumerService.add(a, b);
    }
}
