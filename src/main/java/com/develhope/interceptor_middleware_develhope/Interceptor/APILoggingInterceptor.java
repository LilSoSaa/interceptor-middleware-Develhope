package com.develhope.interceptor_middleware_develhope.Interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class APILoggingInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        // Logs the "User-Agent" header to see which device or browser is making the request
        String userAgent = request.getHeader("User-Agent");
        System.out.println("User-Agent: " + userAgent);
        return true; // Continue processing the request
    }
}
