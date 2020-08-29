package com.demo.many_to_one.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.many_to_one.model.Student;



@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}

