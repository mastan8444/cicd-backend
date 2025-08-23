package com.cicd.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculate")  // root path
@CrossOrigin("*")
public class ArithmaticCalculator{

    @GetMapping("add/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b) {
        return "Addition = " + (a + b);
    }

    @GetMapping("sub/{a}/{b}")
    public String sub(@PathVariable int a, @PathVariable int b) {
        return "Subtraction = " + (a - b);
    }

    @GetMapping("mul/{a}/{b}")
    public String mul(@PathVariable int a, @PathVariable int b) {
        return "Multiplication = " + (a * b);
    }

    @GetMapping("div/{a}/{b}")
    public String div(@PathVariable int a, @PathVariable int b) {
        if (b == 0) {
            return "Division by zero not allowed";
        }
        return "Division = " + (a / b);
    }
}
