package com.langoni.practice.java_practice.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerMongoDb {

    @Id
    private String id;

    private String name;
    private String lastName;
}
