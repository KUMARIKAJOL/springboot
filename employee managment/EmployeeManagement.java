package com.springboot.project.emp.EmployeeManagementSystem.project.model;
import jakarta.persistence.*;
@Entity
@Table(name="emp_management")
public class EmployeeManagement {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="emp_mgmt_id")
private Long id;
@Column(name="emp_name")
private String empName;
private int empId;

private String desegnation;
private String location;
private int salary;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getDesegnation() {
	return desegnation;
}
public void setDesegnation(String desegnation) {
	this.desegnation = desegnation;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public double getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public EmployeeManagement (int empId,String empName,String designation,String location,int salary) {
super();
this.empId=empId;
this.empName=empName;
this.desegnation=desegnation;
this.location=location;
this.salary=salary;
}
public EmployeeManagement() {
}
}



