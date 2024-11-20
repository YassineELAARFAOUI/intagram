package com.meta.intagram.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meta.intagram.models.Student;
import com.meta.intagram.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	public Student getStudentByCie(int cie) {
		return studentRepository.findByCie(cie);
	}

}
