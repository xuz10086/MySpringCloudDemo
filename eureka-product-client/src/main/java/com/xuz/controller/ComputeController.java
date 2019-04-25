package com.xuz.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputeController {

    private final Logger logger = Logger.getLogger(getClass());
    @Autowired
    DiscoveryClient client;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(Integer a, Integer b) {
        ServiceInstance localServiceInstance = client.getLocalServiceInstance();
        logger.info("\n host: " + localServiceInstance.getHost() +
                "\n service id:" + localServiceInstance.getServiceId());
        return a+b;
    }

}
