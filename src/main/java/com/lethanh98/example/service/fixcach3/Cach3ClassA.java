package com.lethanh98.example.service.fixcach3;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class Cach3ClassA {
    private final Cach3ClassB cach3ClassB;

    public Cach3ClassA(@Lazy Cach3ClassB cach3ClassB) {
        this.cach3ClassB = cach3ClassB;
    }
}
