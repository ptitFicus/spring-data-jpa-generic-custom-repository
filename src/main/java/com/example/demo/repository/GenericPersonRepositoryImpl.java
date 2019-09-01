package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class GenericPersonRepositoryImpl {
    @PersistenceContext
    EntityManager entityManager;

    public String entityManagerToString() {
        return entityManager.toString();
    }
}
