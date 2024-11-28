package com.langoni.practice.java_practice.controller;

import com.langoni.practice.java_practice.model.CustomerMongoDb;
import com.langoni.practice.java_practice.repository.CustomerRepositoryMongoDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepositoryMongoDb repositoryMongoDb;

    @GetMapping
    public List<CustomerMongoDb> listCustomersMongoDb(){
        return repositoryMongoDb.findAll();
    }

    @GetMapping("/{id}")
    public Optional<CustomerMongoDb> findById(@PathVariable String id){
        return repositoryMongoDb.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerMongoDb saveCustomer(@RequestBody CustomerMongoDb customerMongoDb){
        return repositoryMongoDb.save(customerMongoDb);
    }

    @DeleteMapping("/{id}")
    public void deleteOneCustomer(@PathVariable String id){
        repositoryMongoDb.deleteById(id);
    }

    @DeleteMapping
    public void deleteAll(){
        repositoryMongoDb.deleteAll();
    }

    @PutMapping("/{id}")
    public CustomerMongoDb updateCustomer(@PathVariable String id, @RequestBody CustomerMongoDb customerMongoDb){
        CustomerMongoDb customerFromDb = repositoryMongoDb.findById(id).orElseThrow(() -> new RuntimeException("Customer not found."));
        customerFromDb.setName(customerMongoDb.getName());
        customerFromDb.setLastName(customerMongoDb.getLastName());
        return repositoryMongoDb.save(customerFromDb);
    }
}
