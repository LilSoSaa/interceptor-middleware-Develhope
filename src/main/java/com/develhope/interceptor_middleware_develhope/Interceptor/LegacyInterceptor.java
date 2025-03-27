package com.develhope.interceptor_middleware_develhope.Interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.io.IOException;

@Component
public class LegacyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        // This blocks any requests to the "/legacy" endpoint
        if (request.getRequestURI().contains("/legacy")) {
            response.sendError(HttpStatus.GONE.value(), "This API is no longer available");
            return false; // Stop request processing
        }
        return true;
    }

}
