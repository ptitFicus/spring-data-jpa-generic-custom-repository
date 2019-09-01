package com.example.demo;

import com.example.demo.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooControllerr {
    @Autowired
    GuestRepository guestRepository;

    @GetMapping("/foo")
    public String foo() {
        return guestRepository.entityManagerToString();
    }
}
