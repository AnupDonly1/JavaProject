package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.db.DemoDB;
import com.example.demo.repository.DemoRepo;

@Repository
public class DemoDaoImpl implements DemoDao {
	
	@Autowired
	private DemoRepo demoRepo;

	@Override
	public DemoDB addDemo(DemoDB demo) {
		// TODO Auto-generated method stub
		return demoRepo.save(demo);
		
		//return null;
	}
	
	@Override
	public List<DemoDB> getByType(String type){
		
		return demoRepo.findByType(type);
	}

}
