package com.example.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	Logger logger = LogManager.getLogger(HelloController.class);
	
	@GetMapping("/{world}")
	public String hello(@PathVariable("world") String world) {
		logger.info("Calling GetHello API");
		String value = "Hello, I am  ";
		return value+world;
	}

}
