package com.springboot.project.emp.EmployeeManagementSystem.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.project.emp.EmployeeManagementSystem.project.model.EmployeeManagement;
import com.springboot.project.emp.EmployeeManagementSystem.project.repogetry.EmployeeMSrepository;

@RestController
@RequestMapping("/emp")
public class EmployeeMSController {
@Autowired
EmployeeMSrepository emr;
@PostMapping("/save")
public void saveEmployee(@RequestBody EmployeeManagement em) {
	emr.save(em);
	}
@RequestMapping("/details")
public List<EmployeeManagement>getBooks(){
	return emr.findAll();
}
@RequestMapping("/update/{id}/{empName}")
public void updateEmployee(@PathVariable("id")Long id,@PathVariable("emp_name")String ename) {
	EmployeeManagement ems = emr.findById(id).get();
	ems.setEmpName(ename);
	emr.save(ems);
	}
@RequestMapping("/details/{id}")
public EmployeeManagement getById(@PathVariable("id")Long id) {
return emr.findById(id).get();
}
@RequestMapping("/delete/{id}")
public void deleteEmployee(@PathVariable("id")Long id) {
emr.deleteById(id);
}

}


