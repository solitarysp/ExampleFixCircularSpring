package com.lethanh98.example.service.errorExample;

import org.springframework.stereotype.Service;

@Service
public class ClassA {
    private final ClassB classB;

    public ClassA(ClassB classB) {
        this.classB = classB;
    }
}
