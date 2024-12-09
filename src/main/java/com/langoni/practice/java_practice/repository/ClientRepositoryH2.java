package com.langoni.practice.java_practice.repository;

import com.langoni.practice.java_practice.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepositoryH2 extends JpaRepository<Client, Long> {
}
