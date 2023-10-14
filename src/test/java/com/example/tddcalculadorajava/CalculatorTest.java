package com.example.tddcalculadorajava;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setup() {
        this.calculator = new Calculator();
    }

    @Test
    void additionTest() {
        Assertions.assertEquals(calculator.addition(7.5, 1.0), 8.5);
    }

    @Test
    void substractionTest() {
        Assertions.assertEquals(calculator.subtraction(5.5,5.0), 0.5);
    }

    @Test
    void multiplyTest(){
        Assertions.assertEquals(calculator.multiply(5.0,5.0), 25.0);
    }

    @Test
    void normalDivideTest() {
        Assertions.assertEquals(calculator.division(25.0, 5.0), 5.0);
    }

    @Test
    void divideByCeroTest() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.division(25.0, 0.0);
        });
    }
}
