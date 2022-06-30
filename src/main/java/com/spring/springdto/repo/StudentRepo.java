package com.spring.springdto.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.springdto.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
}
