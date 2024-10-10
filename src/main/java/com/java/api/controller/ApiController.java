package com.java.api.controller;

import com.java.api.Model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/api/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @PostMapping("/api/greet")
    public String greetUser(@RequestBody User user) {
        return "Hello, " + user.getName() + "!";
    }
}
