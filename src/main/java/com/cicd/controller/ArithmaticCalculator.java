package com.cicd.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")   // ✅ Base URL: /calculate
@CrossOrigin("*")
public class ArithmaticCalculator{

    // Addition
    @GetMapping("/add/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b) {
        return "Addition = " + (a + b);
    }

    // Subtraction
    @GetMapping("/sub/{a}/{b}")
    public String sub(@PathVariable int a, @PathVariable int b) {
        return "Subtraction = " + (a - b);
    }

    // Multiplication
    @GetMapping("/mul/{a}/{b}")
    public String mul(@PathVariable int a, @PathVariable int b) {
        return "Multiplication = " + (a * b);
    }

    // Division
    @GetMapping("/div/{a}/{b}")
    public String div(@PathVariable int a, @PathVariable int b) {
        if (b == 0) {
            return "Error: Division by zero is not allowed!";
        }
        return "Division = " + (a / b);
    }
}
