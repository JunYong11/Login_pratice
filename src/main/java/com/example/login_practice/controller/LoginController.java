package com.example.login_practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("title", "Login");
        model.addAttribute("action", "/login");
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }
}
