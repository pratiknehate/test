package com.pratik.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratik.location.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
