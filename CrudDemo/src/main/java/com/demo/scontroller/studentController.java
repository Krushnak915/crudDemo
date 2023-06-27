package com.demo.scontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.dao.studentService;
import com.demo.model.Student;

@RestController
@RequestMapping("/student")
public class studentController {
	@Autowired
	private studentService stServ;

	@PostMapping("/add")
	public Student createStudent(@RequestBody Student student) {
		Student inserts = stServ.inserts(student);
		return inserts;
	}

	@DeleteMapping("/del/{id}")
	public void adelete(@PathVariable int id) {
		stServ.deletes(id);
		System.out.println("deleted.....");

	}

	@GetMapping("/get")
	public List<Student> getAll() {
		List<Student> allStudent = stServ.getAllStudent();
		return allStudent;

	}

	@PutMapping("/updt/{id}")
	public Student updates(@PathVariable int id, @RequestBody Student st) {
		Student upd = stServ.updates(id, st);
		return upd;
	}
	@GetMapping("/getid/{id}")
	public Student student(@PathVariable int id) {
		return stServ.getstudent(id);
	}
}
