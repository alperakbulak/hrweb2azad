package com.azuread.hrweb2azad.controllers;

import com.azure.core.annotation.Post;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/azad")
public class AuthorizationController {
//    @PostMapping("/azure")
//    @ResponseBody
//    public String hello(){
//        return "Hello World!!";
//    }
    @GetMapping("/code")
    @ResponseBody
    public String sayHello(@RequestParam Object code){
        System.out.println(code);

        return "Hello World";
    }
}
