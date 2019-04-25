package com.xuz.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String add(Integer a, Integer b) {
        return restTemplate.getForEntity("http://eureka-product-client/add?a="+a+"&b="+b,
                String.class).getBody();
    }

    // 如果不加入参数a，b则会出错，必须保证fallback方法与正常执行的方法参数一致
    public String addServiceFallback(Integer a, Integer b) {
        return "error";
    }
}
