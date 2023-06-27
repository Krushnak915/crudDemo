package com.demo.repository;

import org.springframework.data.repository.CrudRepository;


import com.demo.model.Student;

public interface studentRepo extends CrudRepository<Student, Integer> {
	

}
