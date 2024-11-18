package com.example.demo.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/api/v1")
@RestController
public class GetEmpidController {
    @GetMapping("/user")
    public ResponseEntity<String> getUserInfo() {
        return ResponseEntity.ok("82022571");
    }
}






