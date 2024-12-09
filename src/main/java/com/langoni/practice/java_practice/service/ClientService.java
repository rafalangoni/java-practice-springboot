package com.langoni.practice.java_practice.service;

import com.langoni.practice.java_practice.model.Client;
import com.langoni.practice.java_practice.repository.ClientRepositoryH2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepositoryH2 repositoryH2;

    public List<Client> clientList(){
        return repositoryH2.findAll();
    }

}
