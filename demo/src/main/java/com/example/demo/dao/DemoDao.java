package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.db.DemoDB;

public interface DemoDao {

	DemoDB addDemo(DemoDB demo);
	List<DemoDB> getByType(String type);
}
