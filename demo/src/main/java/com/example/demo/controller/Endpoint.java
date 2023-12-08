package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Endpoint {

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to Spring boot App";
	}
	public static void main(String[] args) {
	
		System.out.println("Hello Service Now with Java");
	}
}
