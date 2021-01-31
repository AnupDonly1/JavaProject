package com.example.demo.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.DemoDao;
import com.example.demo.model.Demo;
import com.example.demo.model.db.DemoDB;

@Component
public class DemoServiceImpl implements DemoService {
	
	Logger logger = LogManager.getLogger(DemoServiceImpl.class);
	
	@Autowired
	private DemoDao demoDao;
	
	@Override
	public Demo addDemo(Demo demo) {
		
		if(demo != null) {
			DemoDB demoDB = new DemoDB();
			demoDB.setId(demo.getId());
			demoDB.setType(demo.getType());
			demoDB.setQuality(demo.getQuality());
			demoDB.setCost(demo.getCost());
			System.out.println(demo.getDescription());
			demoDB.setDescription(demo.getDescription());
			 demoDao.addDemo(demoDB);
			 return demo;
		}
		
		return null;
	}
	
	@Override
	public List<DemoDB> getByType(String type) {
		return demoDao.getByType(type);
	}

	
}
