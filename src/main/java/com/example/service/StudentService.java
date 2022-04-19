package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	public Student createStudent (Student student) {
		return studentRepository.save(student);
	}
	
	public Student getStudentbyId(String id) {
		return studentRepository.findById(id).get();
	}
	
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	public Student updateStudent (Student student) {
		return studentRepository.save(student);
	}
	
	public String deleteStudent (String id) {
		studentRepository.deleteById(id);
		return "Student has been deleted.";
	}
	
	public List<Student> getStudentsByName (String name) {
		return studentRepository.findByName(name);
	}
	
	public Student studentsByNameAndMail (String name, String email) {
		return studentRepository.findByEmailAndName(email, name);
	}
	
	public Student studentsByNameOrMail (String name, String email) {
		return studentRepository.findByNameOrEmail(name, email);
	}
	
	public List<Student> emailLike (String email) {
		return studentRepository.findByEmailIsLike(email);
	}
	
	public List<Student> nameStartsWith (String name) {
		return studentRepository.findByNameStartsWith(name);
	}
	
}
