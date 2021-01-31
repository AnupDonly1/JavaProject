package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.db.DemoDB;

@Repository
public interface DemoRepo extends MongoRepository<DemoDB, Integer> {

	List<DemoDB> findByType(String type);
}
