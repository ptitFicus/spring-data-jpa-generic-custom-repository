package com.example.demo.repository;

import com.example.demo.model.Person;

public interface GenericPersonRepository<T extends Person> {
    String entityManagerToString();
}
