package com.kajolbatch4119.springboot.ex.springboot.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kajolbatch4119.springboot.ex.springboot.ex.model.Employee;
import com.kajolbatch4119.springboot.ex.springboot.ex.repogetry.EmployeeRepository;

@SpringBootApplication
public class Application  implements CommandLineRunner {
	 @Autowired
		EmployeeRepository sr;
		public static void main(String[] args) {
			SpringApplication.run(Application.class, args);
		}
		@Override
		public void run(String... args) throws Exception {
			sr.save(new Employee("rahul kumar",50000,"rahul@gmail.com","bulandshahr"));
	        sr.save(new Employee("isha bansal",60000,"yashi@gmail.com","meerut"));
			sr.save(new Employee("Ankit kumar",55000,"ankit@gmail.com","jharkahand"));
	        sr.save(new Employee("praveen",60000,"praveen@gmail.com","bulandshahr"));
		}
}