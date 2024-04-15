package com.seguridad.seguridad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/user")
public class userController {
    @GetMapping("/")
    public String home (){
        return "Este es un end point del User";
    }
    
}


