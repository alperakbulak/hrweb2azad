package com.azuread.hrweb2azad.controllers;

import org.springframework.web.bind.annotation.*;

@RestController("/login")
public class LoginController {
    @GetMapping("/oauth2/authorization/azure")
    public String hello(@RequestParam String token){
        return "Hello World!  " + token;
    }

    @GetMapping("/oauth2/authorization/azure/code")
    public String hello(){
        return "Parametre yok";
    }
}
