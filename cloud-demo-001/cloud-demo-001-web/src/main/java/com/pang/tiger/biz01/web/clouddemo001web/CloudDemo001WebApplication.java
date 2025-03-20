package com.pang.tiger.biz01.web.clouddemo001web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudDemo001WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudDemo001WebApplication.class, args);
    }

}
