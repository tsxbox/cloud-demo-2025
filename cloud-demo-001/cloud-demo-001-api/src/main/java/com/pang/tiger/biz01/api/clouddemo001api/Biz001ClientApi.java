package com.pang.tiger.biz01.api.clouddemo001api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName Biz001ClientApi
 * @Description TODO
 * @Author Tang Shixin
 */
@FeignClient(name = "cloud-demo-01", path = "/app01")
public interface Biz001ClientApi {


    @RequestMapping( "/trace/abc")
    String trace();
}
