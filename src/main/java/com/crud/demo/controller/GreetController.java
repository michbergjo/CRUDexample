package com.crud.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class GreetController {

    @GetMapping("/")
    public String greet() {
        return "greetingpage";
    }
}
