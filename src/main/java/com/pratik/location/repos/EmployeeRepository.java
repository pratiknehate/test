package com.pratik.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratik.location.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
