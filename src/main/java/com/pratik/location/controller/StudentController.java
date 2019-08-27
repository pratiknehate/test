package com.pratik.location.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pratik.location.entities.Student;
import com.pratik.location.servicesImpl.StudentServiceImpl;

@Controller
public class StudentController {

	@Autowired
	StudentServiceImpl studentServiceImpl;
	
	@RequestMapping("/addStudent")
	public String addStudent(@ModelAttribute("Student") Student student,ModelMap map) {
		Student s = studentServiceImpl.addStudent(student);
		map.addAttribute("student", s.getSname());
		return "createStudent";
	}
	
	@RequestMapping("/student")
	public String viewPage() {
		return "createStudent";
	}
	
	@RequestMapping("/registers")
	public String regPage() {
		
		return "registration";
	}
}
