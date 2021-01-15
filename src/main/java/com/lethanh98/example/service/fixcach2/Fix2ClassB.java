package com.lethanh98.example.service.fixcach2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Fix2ClassB {
    private Fix2ClassA fix2ClassA;

    @Autowired
    public void setFix2ClassA(Fix2ClassA fix2ClassA) {
        this.fix2ClassA = fix2ClassA;
    }
}
