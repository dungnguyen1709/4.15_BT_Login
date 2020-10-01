package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    @GetMapping("/")
    public String getHomePage() {
        return "home";
    }
    @GetMapping("/admin")
    public String getAdminPage() {
        return "admin";
    }
    @GetMapping("/user")
    public String getUserPage() {
        return "user";
    }

}