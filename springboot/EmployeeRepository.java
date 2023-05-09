package com.kajolbatch4119.springboot.ex.springboot.ex.repogetry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kajolbatch4119.springboot.ex.springboot.ex.model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}


