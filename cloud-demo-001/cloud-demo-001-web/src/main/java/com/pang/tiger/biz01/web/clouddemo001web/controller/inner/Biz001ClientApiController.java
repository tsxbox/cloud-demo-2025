package com.pang.tiger.biz01.web.clouddemo001web.controller.inner;

import com.pang.tiger.biz01.api.clouddemo001api.Biz001ClientApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName Biz001ClientApiContrioller
 * @Description TODO
 * @Author Tang Shixin
 */
@Slf4j
@RestController
public class Biz001ClientApiController implements Biz001ClientApi {

    @Override
    public String trace() {
        log.info("trace1");
        return UUID.randomUUID().toString();
    }
}
