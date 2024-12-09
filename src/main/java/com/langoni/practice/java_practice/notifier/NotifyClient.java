package com.langoni.practice.java_practice.notifier;

import com.langoni.practice.java_practice.model.Client;

public interface NotifyClient {
    void notify(Client client, String message);
}
