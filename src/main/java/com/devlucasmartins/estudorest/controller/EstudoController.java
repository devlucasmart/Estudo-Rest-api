package com.devlucasmartins.estudorest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EstudoController {
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to a Spring Boot REST API";
    }
}
