package com.pang.tiger.gateway.clouddemogw.filter.global;


import org.slf4j.MDC;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TraceIdFilter extends AbstractGatewayFilterFactory<TraceIdFilter.Config> {

    private static final String TRACE_ID_HEADER = "X-Trace-Id";

    public TraceIdFilter() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            ServerHttpRequest request = exchange.getRequest();
            String traceId = request.getHeaders().getFirst(TRACE_ID_HEADER);

            if (traceId == null || traceId.isEmpty()) {
                traceId = UUID.randomUUID().toString();
            }

            // 将traceId放入MDC
            MDC.put(TRACE_ID_HEADER, traceId);

            // 将traceId放入请求头
            request = request.mutate().header(TRACE_ID_HEADER, traceId).build();
            exchange.mutate().request(request).build();

            return chain.filter(exchange).doFinally(signal -> MDC.remove(TRACE_ID_HEADER));
        };
    }

    public static class Config {
        // 配置属性可以在这里定义
    }
}