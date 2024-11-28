package com.langoni.practice.java_practice.repository;

import com.langoni.practice.java_practice.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositoryH2 extends JpaRepository<Client, Long> {
}
