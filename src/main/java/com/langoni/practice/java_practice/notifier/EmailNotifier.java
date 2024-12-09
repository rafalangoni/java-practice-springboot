package com.langoni.practice.java_practice.notifier;

import com.langoni.practice.java_practice.model.Client;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@UrgencyType(UrgencyLevel.REGULAR)
@Component
public class EmailNotifier implements NotifyClient{
    @Override
    public void notify(Client client, String message) {
        System.out.printf("Notifying client %s by email %s: %s \n", client.getName(), client.getEmail(), message);
    }
}
