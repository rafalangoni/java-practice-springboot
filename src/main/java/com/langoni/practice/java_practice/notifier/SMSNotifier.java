package com.langoni.practice.java_practice.notifier;

import com.langoni.practice.java_practice.model.Client;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@UrgencyType(UrgencyLevel.URGENT)
@Component
public class SMSNotifier implements NotifyClient{
    @Override
    public void notify(Client client, String message) {
        System.out.printf("Notifying client %s by SMS in phone %s: %s, \n", client.getName(), client.getPhoneNumber(), message);
    }
}
