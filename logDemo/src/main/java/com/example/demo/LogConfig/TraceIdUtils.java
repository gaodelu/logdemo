package com.example.demo.LogConfig;

import org.slf4j.MDC;
import org.springframework.util.StringUtils;

import java.util.UUID;

/**
 * @Author Mochi
 * @Description 日志唯一uuid
 * @Date 2020/5/26 10:56
 * @Name TraceIdUtils
 */
public class TraceIdUtils {
    private static final String UUID_KEY = "MOCHI";

    public static String createTraceId() {
        return UUID.randomUUID().toString();
    }

    public static String getTraceId() {
        return String.valueOf(MDC.get(UUID_KEY));
    }


    public static void updateTraceId(String traceId) {
        if (StringUtils.isEmpty(traceId)) {
            MDC.put(UUID_KEY, createTraceId());
        } else {
            MDC.put(UUID_KEY, traceId);
        }
    }
}
