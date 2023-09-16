package com.sergio.auth.backend.resources.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/messages")
    public String getMessages() {
        return "the protected messages";
    }
    @GetMapping("/test2")
    public String gettest2() {
        return "the test2 message";
    }
}
