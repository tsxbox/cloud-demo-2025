package com.pang.tiger.biz01.web.clouddemo001web.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class CommonProperties {


    private final RedisTemplate<String, String> redisTemplate;

    public CommonProperties(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Value("${common.name:1212}")
    private String name;

    @Value("${common.version:12e21}")
    private String version;

    @PostConstruct
    public void init() {
        redisTemplate.opsForValue().set("name", name);
    }
}
