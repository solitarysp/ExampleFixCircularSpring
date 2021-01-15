package com.lethanh98.example.service.fixcach3;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class Cach3ClassB {
    private final Cach3ClassA classA;

    public Cach3ClassB(@Lazy Cach3ClassA classA) {
        this.classA = classA;
    }
}
