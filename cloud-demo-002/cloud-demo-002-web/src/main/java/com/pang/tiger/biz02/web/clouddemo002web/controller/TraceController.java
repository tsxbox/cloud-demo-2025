package com.pang.tiger.biz02.web.clouddemo002web.controller;

import com.pang.tiger.biz01.api.clouddemo001api.Biz001ClientApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TraceCntroller
 * @Description TODO
 * @Author Tang Shixin
 */
@Slf4j
@RestController
public class TraceController {

    @Autowired
    private Biz001ClientApi api;

    @RequestMapping("/trace")
    public String trace() {
        log.info("trace");
        return api.trace();
    }
}
