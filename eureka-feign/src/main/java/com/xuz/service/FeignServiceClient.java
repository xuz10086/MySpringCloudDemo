package com.xuz.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-product-client",
        fallback = FeignServiceClientHystrix.class) // 服务提供者的服务名，容错保护
public interface FeignServiceClient {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    Integer add(@RequestParam(value = "a") Integer a,
                @RequestParam(value = "b") Integer b); // 这里须加上@RequestParam，参数会拼到URL路径上
}
