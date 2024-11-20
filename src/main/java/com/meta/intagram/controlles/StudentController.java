package com.meta.intagram.controlles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meta.intagram.models.Student;
import com.meta.intagram.services.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@GetMapping("/cie/{cie}")
	public Student getStudentByEmail(@PathVariable int cie) {
		return studentService.getStudentByCie(cie);
		
	}
}
