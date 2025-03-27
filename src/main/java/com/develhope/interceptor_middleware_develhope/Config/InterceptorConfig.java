package com.develhope.interceptor_middleware_develhope.Config;

import com.develhope.interceptor_middleware_develhope.Interceptor.APILoggingInterceptor;
import com.develhope.interceptor_middleware_develhope.Interceptor.LegacyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    private final APILoggingInterceptor apiLoggingInterceptor;  // This is the interceptor that logs requests
    private final LegacyInterceptor legacyInterceptor;  // This is the interceptor that blocks legacy requests

    // Constructor to create instances of the interceptors
    public InterceptorConfig(APILoggingInterceptor apiLoggingInterceptor, LegacyInterceptor legacyInterceptor) {
        this.apiLoggingInterceptor = apiLoggingInterceptor;
        this.legacyInterceptor = legacyInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // Adds the logging interceptor to all requests
        registry.addInterceptor(apiLoggingInterceptor);

        // Adds the legacy interceptor only to the "/legacy" endpoint
        registry.addInterceptor(legacyInterceptor).addPathPatterns("/legacy");
    }
}
