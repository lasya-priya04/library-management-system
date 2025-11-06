package com.bookStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin() {
        // Spring Security automatically handles authentication
        // Redirect to home page on successful login
        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout() {
        // Spring Security automatically handles logout
        // Redirect to login page on logout
        return "redirect:/login?logout";
    }
}
