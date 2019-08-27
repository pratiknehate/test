package com.pratik.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pratik.location.entities.Employee;
import com.pratik.location.servicesImpl.EmpployeeServiceImpl;

@Controller
public class EmployeeController {

	@Autowired
	EmpployeeServiceImpl empployeeServiceImpl;

	@RequestMapping("/addEmp")
	public String test() {
		return "createEmployee";
	}

	@RequestMapping("/saveEmp")
	public String addEmp(@ModelAttribute("Employee") Employee employee, ModelMap map) {
		Employee emp = empployeeServiceImpl.saveEmp(employee);
		String msg = "employee saved with id: " + emp.getId();
		map.addAttribute("msg", msg);
		return "createEmployee";
	}

	@RequestMapping("/displayEmployee")
	public String showAllEmp(ModelMap map) {
		List<Employee> employees = empployeeServiceImpl.getAllEmployees();
		map.addAttribute("employees", employees);
		return "displayEmployee";
	}
}
