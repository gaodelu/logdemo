package com.example.demo.LogConfig;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

/**
 * @Author Mochi
 * @Description TODO
 * @Date 2020/5/26 11:02
 * @Name LogConvert
 */
public class LogConvert extends ClassicConverter {
    @Override
    public String convert(ILoggingEvent iLoggingEvent) {
        return TraceIdUtils.getTraceId();
    }
}
