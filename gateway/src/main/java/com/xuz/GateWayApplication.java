package com.xuz;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GateWayApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(GateWayApplication.class).web(true).run(args);
    }
}
