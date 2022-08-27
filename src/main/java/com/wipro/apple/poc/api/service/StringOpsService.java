package com.wipro.apple.poc.api.service;

import org.springframework.stereotype.Service;

@Service
public class StringOpsService {

    public String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public Integer stringLength(String input) {
        return input.length();
    }
}
