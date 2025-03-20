package com.pang.tiger.biz02.web.clouddemo002web.util;

import org.slf4j.MDC;

import java.util.UUID;

/**
 * @ClassName TraceUtil
 * @Description TODO
 * @Author Tang Shixin
 */
public class TraceUtil {

    public static final String TRACE_ID_KEY = "traceId";

    /**
     * 获取当前 MDC 中的 traceId，如果不存在则生成一个新的
     *
     * @return 当前的 traceId
     */
    public static String getOrCreateTraceId() {
        String traceId = MDC.get(TRACE_ID_KEY);
        if (traceId == null) {
            traceId = generateTraceId();
            MDC.put(TRACE_ID_KEY, traceId);
        }
        return traceId;
    }

    /**
     * 生成一个新的 traceId
     *
     * @return 新的 traceId
     */
    private static String generateTraceId() {
        return UUID.randomUUID().toString();
    }

    /**
     * 清除 MDC 中的 traceId
     */
    public static void clearTraceId() {
        MDC.remove(TRACE_ID_KEY);
    }
}
