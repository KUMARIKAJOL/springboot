package com.springboot.project.emp.EmployeeManagementSystem.project.repogetry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.project.emp.EmployeeManagementSystem.project.model.EmployeeManagement;


@Repository
public interface EmployeeMSrepository extends JpaRepository<EmployeeManagement,Long>{

}


