package com.pang.tiger.biz02.web.clouddemo002web.interceptor;

import com.pang.tiger.biz02.web.clouddemo002web.util.TraceUtil;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

/**
 * @ClassName CustomRequestInterceptor
 * @Description  请求拦截器: feign调用时，将traceId传递给feign
 * @Author Tang Shixin
 */
@Component
public class CustomRequestInterceptor  implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        String orCreateTraceId = TraceUtil.getOrCreateTraceId();
        requestTemplate.header(TraceUtil.TRACE_ID_KEY, orCreateTraceId);
        requestTemplate.header("Authorization", "Bearer your_token_here");
    }
}
