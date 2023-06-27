package com.demo.dao;

import java.util.List;
import com.demo.model.Student;

public interface studentService {

	Student inserts(Student student);
	Student updates(int id, Student student);
	void deletes(int id);
	List<Student> getAllStudent();
	Student  getstudent(int id);
}
