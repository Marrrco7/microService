package com.example.microService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public class sayHelloController {
        @GetMapping(    "/greet")
    public Map<String, String> greetUser() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, World!");
        response.put("timestamp", LocalDateTime.now().toString());
        return response;
    }

}
