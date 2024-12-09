package com.langoni.practice.java_practice.notifier;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface UrgencyType {

    UrgencyLevel value();
}
