package com.langoni.practice.java_practice.repository;

import com.langoni.practice.java_practice.model.CustomerMongoDb;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepositoryMongoDb extends MongoRepository<CustomerMongoDb, String> {
}
