package com.example.helloCoontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping("/{world}")
	public String hello(@PathVariable("world") String world) {
		String value = "Hello ";
		return value+world;
	}

}
