package com.langoni.practice.java_practice.service;

import com.langoni.practice.java_practice.model.Client;
import com.langoni.practice.java_practice.notifier.EmailNotifier;
import com.langoni.practice.java_practice.notifier.NotifyClient;
import com.langoni.practice.java_practice.notifier.UrgencyLevel;
import com.langoni.practice.java_practice.notifier.UrgencyType;
import com.langoni.practice.java_practice.repository.ClientRepositoryH2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepositoryH2 repositoryH2;

    @UrgencyType(UrgencyLevel.REGULAR)
    @Autowired
    private NotifyClient notifier;

    public List<Client> clientList() {
        return repositoryH2.findAll();
    }

    public Client saveClient(Client client) {
        notifier.notify(client, "Client was created!");
        return repositoryH2.save(client);
    }

    public void deleteClient(Long id) {
        repositoryH2.deleteById(id);
    }

    public Client updateClient(Long id, Client client) {
        Client existingClient = repositoryH2.findById(id).orElseThrow(() -> new RuntimeException("Client not found."));
        existingClient.setName(client.getName());
        return repositoryH2.save(existingClient);
    }
}
