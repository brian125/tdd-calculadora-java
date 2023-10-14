package com.example.tddcalculadorajava;

public class Calculator {

    public Double addition(Double n1,Double n2) {
        return n1 + n2;
    }

    public Double subtraction(Double n1,Double n2) {
        return n1 - n2;
    }

    public Double multiply(Double n1,Double n2) {
        return n1 * n2;
    }

    public Double division(Double n1,Double n2) {
        if (n2 == 0.0) {
            throw new ArithmeticException();
        }
        return n1 / n2;
    }

}
