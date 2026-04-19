package com.indra.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.student.enitity.Student;
import com.indra.student.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	public Student save(Student s) {
		return repo.save(s);
		
	}

	public List<Student> getAllStudents() {
	    return repo.findAll();
	}

	
	public Optional<Student> getById(Long id){
		return repo.findById(id);
	}
	public void delete (Long id) {
		repo.deleteById(id);
	}

}
