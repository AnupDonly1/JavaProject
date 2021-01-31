package com.example.demo.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Demo;
import com.example.demo.model.db.DemoDB;
import com.example.demo.service.DemoService;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	Logger logger = LogManager.getLogger(DemoController.class);
	
	@Autowired
	private DemoService demoService;
	
	@GetMapping("/{world}")
	public String hello(@PathVariable("world") String world) {
		logger.info("Calling GetHello API");
		String value = "Hello, I am  ";
		return value+world;
	}
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	public @ResponseBody Demo addDemo(@RequestBody Demo demo) {
		if(demo !=null) {
		return demoService.addDemo(demo);
		}
		return null;
	}
	
	@GetMapping(path="type/{type}", produces ="application/json")
	public @ResponseBody List<DemoDB> getByType(@PathVariable("type")String type) {
		
		return demoService.getByType(type);
		//return null;
		
	}

}
