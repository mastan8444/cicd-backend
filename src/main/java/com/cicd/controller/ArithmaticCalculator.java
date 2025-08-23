package com.cicd.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/")
@CrossOrigin("*")


public class ArithmaticCalculator {
	@GetMapping("add/{A}/{B}")
	public String add(@PathVariable("A")int a,@PathVariable("B")int b) {
		return "Addition = " + (a + b) + ", Subtraction = " + (a - b);
	}
	public String sub(@PathVariable("A")int a,@PathVariable("B")int b) {
		return "subtraction =" + (a-b);
	}
	public String mul(@PathVariable("A")int a,@PathVariable("B")int b) {
		return "mul =" + (a*b);
	}
}
