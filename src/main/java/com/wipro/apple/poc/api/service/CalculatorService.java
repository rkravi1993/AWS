package com.wipro.apple.poc.api.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Integer sum(int input1, int input2) {
        return input1 + input2;
    }

    public Integer product(int input1, int input2) {
        return input1 * input2;
    }

    public Integer modulo(int input1, int input2) {
        return input1 % input2;
    }
}
