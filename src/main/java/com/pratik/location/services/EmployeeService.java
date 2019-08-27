package com.pratik.location.services;

import java.util.List;

import com.pratik.location.entities.Employee;

public interface EmployeeService {
	
	Employee saveEmp(Employee employee);
	Employee updateEmployee(Employee employee);
	void deleteEmployee(Employee employee);
	Employee getEmployeeById(int id);
	List<Employee> getAllEmployees();


}
