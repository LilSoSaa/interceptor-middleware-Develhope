package com.develhope.interceptor_middleware_develhope.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/time")
public class BasicController {

    // Endpoint that returns the current date and time
    @GetMapping
    public ResponseEntity<String> getCurrentTime() {
        // Returns the current time as a string
        return ResponseEntity.ok(LocalDateTime.now().toString());
    }
}
