package com.pang.tiger.biz02.web.clouddemo002web;

import com.pang.tiger.biz01.api.clouddemo001api.Biz001ClientApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClientProperties;

@SpringBootApplication(scanBasePackages = {"com.pang.tiger.biz02.web.clouddemo002web", "com.pang.tiger.biz01.api.clouddemo001api"})
@EnableFeignClients(defaultConfiguration = FeignClientProperties.FeignClientConfiguration.class, clients = {Biz001ClientApi.class})
public class CloudDemo002WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudDemo002WebApplication.class, args);
    }

}
