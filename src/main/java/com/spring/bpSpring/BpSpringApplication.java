package com.spring.bpSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Supplier;

@SpringBootApplication
public class BpSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BpSpringApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired EmployeeService employeeService;

	//curl -H "Content-Type: text/plain" localhost:8080/getEmployees
	@Bean
	public Supplier<Iterable<Employee>> getEmployees(){
		return () -> {
			employeeRepository.saveAll(new EmployeeService().employees());
			return employeeRepository.findAll();
		};
	}

}
