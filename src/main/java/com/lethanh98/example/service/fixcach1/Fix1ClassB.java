package com.lethanh98.example.service.fixcach1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Fix1ClassB {
    @Autowired
    private Fix1ClassA fix1ClassA;

}
