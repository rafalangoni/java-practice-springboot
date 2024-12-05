package com.langoni.practice.java_practice.notification;

import com.langoni.practice.java_practice.model.Client;

public interface Notify {
    void notify(Client client, String message);
}
