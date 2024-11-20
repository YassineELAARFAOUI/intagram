package com.meta.intagram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meta.intagram.models.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
	Student findByCie(int cie);
}
