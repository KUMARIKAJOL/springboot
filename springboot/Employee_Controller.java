package com.kajolbatch4119.springboot.ex.springboot.ex.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kajolbatch4119.springboot.ex.springboot.ex.model.Employee;
import com.kajolbatch4119.springboot.ex.springboot.ex.repogetry.EmployeeRepository;


@RestController
@RequestMapping("/student")
public class Employee_Controller {
	@Autowired
EmployeeRepository sr;
@RequestMapping("/details")
public List<Employee> getStudents(){
	return sr.findAll();
}
}