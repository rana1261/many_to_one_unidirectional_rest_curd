package com.demo.many_to_one.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.many_to_one.model.Laptop;



@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
    List<Laptop> findByStudentId(Long studentId);
    Optional<Laptop> findByLidAndStudentId(Long id, Long studentId);
}
