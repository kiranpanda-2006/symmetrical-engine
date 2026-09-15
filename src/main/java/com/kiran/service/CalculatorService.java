package com.kiran.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Integer add(int a, int b){
        return a+b;
    }

    public Integer substract(int a, int b){

        return a-b;
    }

    public Integer multiply(int a, int b){
        return a*b;
    }

    public Integer devide(int a, int b){

        if (b == 0){
            throw new RuntimeException("Undefined");
        }
        return a/b;
    }
}
