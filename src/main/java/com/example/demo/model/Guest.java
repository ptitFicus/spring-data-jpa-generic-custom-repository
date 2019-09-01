package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GUEST")
public class Guest extends Person {
    @Id
    public String guestId;
}
