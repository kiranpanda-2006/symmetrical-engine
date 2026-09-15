package com.kiran.controller;

import com.kiran.service.CalculatorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping("/health")
    public ResponseEntity<Map<String,String>> health(){
        Map<String,String> health = new HashMap<>();

        health.put("status","up");
        health.put("service","Spring-demo-GitHubAction");
        health.put("version",System.getenv()
                .getOrDefault("API_VERSION", "dev"));
        return ResponseEntity.status(HttpStatus.OK)
                .body(health);
    }

    @GetMapping("/add")
    public Integer add(int a, int b){
        return calculatorService.add(a,b);
    }

    @GetMapping("/multiply")
    public Integer multiply(int a, int b){
        return calculatorService.multiply(a,b);
    }
}
