package com.calculatortesting.calculatortesting.service.impl;

import com.calculatortesting.calculatortesting.exceptions.DivideByZeroException;
import com.calculatortesting.calculatortesting.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String welcome() {
        return "Welcome to Calculator";
    }

    @Override
    public Integer plus(Integer num1, Integer num2) {
        return (num1 + num2);
    }

    public int minus(int num1, int num2) {
        return (num1 - num2);
    }

    public int multiply(int num1, int num2) {
        return (num1 * num2);
    }

    public int divide(int num1, int num2) {

        if (num2 == 0) {
            throw new DivideByZeroException();
        }
        return (num1 / num2);
        }
    }



