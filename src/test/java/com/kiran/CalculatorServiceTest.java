package com.kiran;

import com.kiran.service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService =
            new CalculatorService();

    @Test
    void shouldAddNumbers() {
        assertEquals(5, calculatorService.add(2, 3));
    }

    @Test
    void shouldSubtractNumber() {
        assertEquals(1, calculatorService.substract(3, 2));
    }

    @Test
    void shouldMultiplyNumber() {
        assertEquals(6, calculatorService.multiply(3, 2));
    }

    @Test
    void shouldDivideNumber() {
        assertEquals(5, calculatorService.devide(10, 2));
    }

}
