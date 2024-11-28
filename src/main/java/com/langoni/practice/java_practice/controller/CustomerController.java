package com.langoni.practice.java_practice.controller;

import com.langoni.practice.java_practice.model.CustomerMongoDb;
import com.langoni.practice.java_practice.repository.CustomerRepositoryMongoDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepositoryMongoDb repositoryMongoDb;

    @GetMapping
    public List<CustomerMongoDb> listCustomersMongoDb(){
        return repositoryMongoDb.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerMongoDb saveCustomer(@RequestBody CustomerMongoDb customerMongoDb){
        return repositoryMongoDb.save(customerMongoDb);
    }
}
