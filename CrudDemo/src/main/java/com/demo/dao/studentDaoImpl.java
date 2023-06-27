package com.demo.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.model.Student;
import com.demo.repository.studentRepo;

@Service
public class studentDaoImpl implements studentService {

	@Autowired
	private studentRepo sRepo;

	public Student inserts(Student student) {
		Student save = sRepo.save(student);
		return save;
	}

	public void deletes(int id) {
		Student del = sRepo.findById(id).get();
		sRepo.delete(del);
	}

	public List<Student> getAllStudent() {
		List<Student> all = (List<Student>) sRepo.findAll();
		return all;
	}

	@Override
	public Student updates(int id, Student student) {
		Student student2 = sRepo.findById(id).get();
		student2.setName(student.getName());
		student2.setCity(student.getCity());
		Student save = sRepo.save(student2);
		return save;
	}

	@Override
	public Student getstudent(int id) {
		return sRepo.findById(id).get();

	}

}
