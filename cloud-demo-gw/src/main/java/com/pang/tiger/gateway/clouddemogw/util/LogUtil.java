package com.pang.tiger.gateway.clouddemogw.util;

import org.slf4j.MDC;

/**
 * @ClassName LogUtil
 * @Description TODO
 * @Author Tang Shixin
 */
public class LogUtil {

    private static final String TRSP_ID = "trspId";

    private static final String TRACE_ID_HEADER = "X-Trace-Id";

    public static void setTraceId(String traceId) {
        MDC.put(TRACE_ID_HEADER, traceId);
    }

    public static void clearTraceId() {
        MDC.remove(TRACE_ID_HEADER);
    }
}
