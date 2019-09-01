package com.example.demo.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Person {
    public String lastName;
    public String firstName;
    public Integer age;
}
