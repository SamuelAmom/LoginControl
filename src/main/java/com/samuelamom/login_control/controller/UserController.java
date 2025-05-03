package com.samuelamom.login_control.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class UserController {
    @GetMapping("/public")
    public String publicAccess() {
        return " Endpoint público - acessível sem login";
    }

    @GetMapping("/client")
    public String clientAccess() {
        return " Acesso liberado para CLIENT";
    }

    @GetMapping("/admin")
    public String adminAccess() {
        return " Acesso liberado para ADMIN";
    }
}
