package com.langoni.practice.java_practice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table (name = "clients")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

}
