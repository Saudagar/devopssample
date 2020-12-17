package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDocker {

	@RequestMapping("/docker")
	public String hello() {
		return "Hello! from Jenkinks to Docker!!";
	}
}
