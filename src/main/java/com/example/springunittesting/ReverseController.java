package com.example.springunittesting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {
    @GetMapping("/reverse")
    public String reverse(String name) {
        StringBuilder input = new StringBuilder();
        input.append(name);
        return String.valueOf(input.reverse());
    }
}
