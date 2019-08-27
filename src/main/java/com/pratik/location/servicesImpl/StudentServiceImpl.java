package com.pratik.location.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratik.location.entities.Student;
import com.pratik.location.repos.StudentRepository;
import com.pratik.location.services.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student addStudent(Student student) {		
		Student student2 = studentRepository.save(student);
		return student2;
	}

}
