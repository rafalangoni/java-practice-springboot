package com.langoni.practice.java_practice.controller;

import com.langoni.practice.java_practice.model.Client;
import com.langoni.practice.java_practice.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientRepository repository;

    @GetMapping
    public List<Client> clientList(){
        return repository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client createClient(@RequestBody Client client){
        return repository.save(client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id){
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Client updateClient(@PathVariable Long id, @RequestBody Client client){
        Client existingClient = repository.findById(id).orElseThrow(() -> new RuntimeException("Client not found."));
        existingClient.setName(client.getName());
        return repository.save(existingClient);
    }
}
