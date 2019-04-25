package com.xuz;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProductClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaProductClientApplication.class).web(true).run(args);
    }
}
