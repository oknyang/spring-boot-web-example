package com.springboot.community.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorityTestController {
    @GetMapping("/facebook")
    public String facebook() {
        return "facebook";
    }

    @GetMapping("/google")
    public String google() {
        return "google";
    }

    @GetMapping("/kakao")
    public String kako() {
        return "kakao";
    }
}
