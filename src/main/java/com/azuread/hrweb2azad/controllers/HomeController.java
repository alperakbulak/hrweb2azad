package com.azuread.hrweb2azad.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    @PreAuthorize("hasRole('Users')")
    @RequestMapping("/")
    public String helloWorld() {
        return "Hello Users!";
    }
    @PreAuthorize("hasRole('Group1')")
    @RequestMapping("/Group1")
    public String groupOne() {
        return "Hello Group 1 Users!";
    }
    @PreAuthorize("hasRole('Group2')")
    @RequestMapping("/Group2")
    public String groupTwo() {
        return "Hello Group 2 Users!";
    }
}