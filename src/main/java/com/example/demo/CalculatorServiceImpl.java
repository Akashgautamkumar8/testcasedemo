package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public double add(double input1, double input2) {
        return input1 + input2;
    }

    @Override
    public double subtract(double input1, double input2) {
        return input1 - input2;
    }

    @Override
    public double multiply(double input1, double input2) {
        return input1 * input2;
    }

    @Override
    public double divide(double input1, double input2) {
        return input1 / input2;
    }
}
