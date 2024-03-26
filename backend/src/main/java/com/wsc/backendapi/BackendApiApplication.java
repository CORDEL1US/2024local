package com.wsc.backendapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BackendApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApiApplication.class, args);
    }

    @GetMapping(value = "/login", produces = "application/json")
    public ResponseEntity<String> loginController(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password) {
        // 모든 사용자를 로그인 성공으로 처리합니다.
        return ResponseEntity.ok().body("{\"message\": \"Login successful!\"}");
    }
    
    @GetMapping(value = "/health", produces = "application/json")
    public ResponseEntity<String> healthController() {
        return ResponseEntity.ok().body("{\"status\": \"Healthy\"}");
    }
}
