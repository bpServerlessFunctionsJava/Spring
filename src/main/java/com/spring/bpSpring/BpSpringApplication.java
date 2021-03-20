package com.spring.bpSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionRegistration;
import org.springframework.cloud.function.context.FunctionType;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.GenericApplicationContext;

import java.util.function.Supplier;

@SpringBootApplication
public class BpSpringApplication implements ApplicationContextInitializer<GenericApplicationContext> {

	public static void main(String[] args) {
		SpringApplication.run(BpSpringApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void initialize(GenericApplicationContext context) {
		context.registerBean("getEmployees", FunctionRegistration.class,
				() -> new FunctionRegistration<>(new EmployeeFunction()).type(FunctionType.from(String.class).to(String.class)));
	}
}
