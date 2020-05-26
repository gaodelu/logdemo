package com.example.demo.filter;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author Mochi
 * @Description TODO
 * @Date 2020/5/26 10:37
 * @Name LogFilter
 */
@Slf4j
@WebFilter(value = "/*")
public class LogFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain){
        this.insertMDC(servletRequest);
        try {
            filterChain.doFilter(servletRequest, servletResponse);
        } catch (Exception e) {
            MDC.clear();
        }
    }

    @Override
    public void destroy() {

    }

    void insertMDC(ServletRequest request) {
        String flag = ((HttpServletRequest) request).getHeader("pressureFlag");
        if ("1".equals(flag)) {
            MDC.put("pressureShadow", "1");
        }
    }
}
