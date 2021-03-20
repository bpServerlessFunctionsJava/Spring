package com.spring.bpSpring;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Function;

public class EmployeeFunction implements Function<String, String> {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public String apply(String s) {
        return employeeRepository.findAll().toString();
    }
}

