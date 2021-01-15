package com.lethanh98.example.service.fixcach2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Fix2ClassA {
    private Fix2ClassB fix2ClassB;

    @Autowired
    public void setFix2ClassB(Fix2ClassB fix2ClassB) {
        this.fix2ClassB = fix2ClassB;
    }
}
