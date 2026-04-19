package com.indra.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indra.student.enitity.Student;
import com.indra.student.service.StudentService;

@RestController
@RequestMapping("/students")
@CrossOrigin("*")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping
	public List<Student> getAllStudents() {
	    return service.getAllStudents();
	}

	
	@PostMapping
	public Student addStudent(@RequestBody Student s) {
		return service.save(s);
	}
	
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable Long id) {
		return service.getById(id).orElse(null);
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable Long id) {
		service.delete(id);
		return "Deleted";
	}
	
	
	
	

}
