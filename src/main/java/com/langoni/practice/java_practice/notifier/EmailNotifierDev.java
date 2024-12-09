package com.langoni.practice.java_practice.notifier;

import com.langoni.practice.java_practice.model.Client;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@UrgencyType(UrgencyLevel.REGULAR)
@Component
public class EmailNotifierDev implements NotifyClient{
    @Override
    public void notify(Client client, String message) {
        System.out.printf("MOCK: Notifying client %s by email %s: %s \n", client.getName(), client.getEmail(), message);
    }
}
