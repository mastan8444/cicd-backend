package com.cicd.controller;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/math")
@CrossOrigin("*")
public class MathController {

    @GetMapping("/calculate/{A}/{B}")
    public Object calculate(
            @PathVariable int A,
            @PathVariable int B,
            @RequestParam(required = false) String operation) {

        // If operation is given → perform only that
        if (operation != null && !operation.isEmpty()) {
            switch (operation.toLowerCase()) {
                case "add":
                    return "Addition = " + (A + B);
                case "sub":
                    return "Subtraction = " + (A - B);
                case "mul":
                    return "Multiplication = " + (A * B);
                case "div":
                    return (B != 0) ? "Division = " + ((double) A / B) : "Error: Division by zero";
                default:
                    return "Invalid operation! Use add, subtract, multiply, or divide.";
            }
        }

        // If no operation is given → return all results
        Map<String, Object> result = new HashMap<>();
        result.put("Addition", A + B);
        result.put("Subtraction", A - B);
        result.put("Multiplication", A * B);
        result.put("Division", (B != 0) ? ((double) A / B) : "Error: Division by zero");
        return result;
    }
}
