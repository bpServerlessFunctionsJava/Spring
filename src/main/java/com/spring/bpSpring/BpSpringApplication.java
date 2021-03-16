package com.spring.bpSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Function;

@SpringBootApplication
public class BpSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BpSpringApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	//curl -H "Content-Type: text/plain" localhost:8080/toUpperCase -d "param"
//	@Bean
//	public Function<String,String> toUpperCase() {
//		return  (value) -> new StringBuilder(value).toString().toUpperCase();
//	}
//
//	//curl -H "Content-Type: text/plain" localhost:8080/getMessage
//	@Bean
//	public Supplier<String> getMessage(){
//		return () -> "test";
//	}
//
//	//curl -H "Content-Type: text/plain" localhost:8080/toUpperCase -d "this is a test"
//	@Bean
//	public Consumer<String> writeMessage(){return (value) -> System.out.println(value);}

	//curl -H "Content-Type: text/plain" localhost:8080/getEmployeesTest
	@Bean
	public Supplier<Iterable<Employee>> getEmployeesTest(){
		return () -> {
			employeeRepository.saveAll(new GetEmployees().employees());
			return employeeRepository.findAll();
		};
	}

}
