package com.jpa.thymeleaf;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jpa.thymeleaf.model.Employee;
import com.jpa.thymeleaf.repository.EmployeeRepository;


@SpringBootApplication
public class ThymeleafDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafDemo2Application.class, args);
	}
	
	@Bean
	CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository) {
		return args ->{
			for(int i=1 ; i<=30 ; i++) {
				employeeRepository.save(new Employee(0,"nom "+i,"prenom "+i,"a@a"+i));

			}

			employeeRepository.findAll().forEach(p->{
				System.out.print(p);
			});
		};
	}

}
