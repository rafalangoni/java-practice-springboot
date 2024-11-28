package com.langoni.practice.java_practice.controller;

import com.langoni.practice.java_practice.model.Client;
import com.langoni.practice.java_practice.model.CustomerMongoDb;
import com.langoni.practice.java_practice.repository.ClienteRepositoryH2;
import com.langoni.practice.java_practice.repository.CustomerRepositoryMongoDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClienteRepositoryH2 clientRepository;


    @GetMapping
    public List<Client> clientList(){
        return clientRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client createClient(@RequestBody Client client){
        return clientRepository.save(client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id){
        clientRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Client updateClient(@PathVariable Long id, @RequestBody Client client){
        Client existingClient = clientRepository.findById(id).orElseThrow(() -> new RuntimeException("Client not found."));
        existingClient.setName(client.getName());
        return clientRepository.save(existingClient);
    }
}
