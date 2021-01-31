package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Demo;
import com.example.demo.model.db.DemoDB;

public interface DemoService {

	Demo addDemo(Demo demo);
	List<DemoDB>  getByType(String type);
}
