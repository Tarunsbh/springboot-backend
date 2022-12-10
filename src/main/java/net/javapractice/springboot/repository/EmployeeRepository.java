package net.javapractice.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javapractice.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	//all crud database methods
	
}
