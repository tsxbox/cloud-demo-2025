package com.pang.tiger.biz02.web.clouddemo002web.config;

import com.alibaba.cloud.nacos.NacosConfigProperties;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class CommonProperties {

    private final NacosConfigProperties nacosConfigProperties;

    private final RedisTemplate<String, String> redisTemplate;

    public CommonProperties(NacosConfigProperties nacosConfigProperties, RedisTemplate<String, String> redisTemplate) {
        this.nacosConfigProperties = nacosConfigProperties;
        this.redisTemplate = redisTemplate;
    }

    @Value("${common.name:1212}")
    private String name;

    @Value("${common.version:12e21}")
    private String version;

    @PostConstruct
    public void init() {
        System.out.println("nacosConfigProperties:" + nacosConfigProperties);
        System.out.println("name:" + name);
        System.out.println("version:" + version);
        redisTemplate.opsForValue().set("name", name);
    }
}
