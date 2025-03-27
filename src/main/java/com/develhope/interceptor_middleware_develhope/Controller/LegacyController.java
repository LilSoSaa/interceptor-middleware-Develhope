package com.develhope.interceptor_middleware_develhope.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/legacy")
public class LegacyController {

    // This endpoint should return a message, but will be blocked by the interceptor
    @GetMapping
    public ResponseEntity<String> getLegacyMessage() {
        return ResponseEntity.ok("This is just old code");
    }
}
