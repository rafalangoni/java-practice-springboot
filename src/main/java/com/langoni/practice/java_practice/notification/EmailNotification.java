package com.langoni.practice.java_practice.notification;

import com.langoni.practice.java_practice.model.Client;

public class EmailNotification implements Notify{
    @Override
    public void notify(Client client, String message) {
        System.out.printf("Notifying %s by email: %s \n", client.getName(), message);
    }
}
