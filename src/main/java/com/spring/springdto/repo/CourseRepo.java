package com.spring.springdto.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.springdto.model.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course,Long> {
}
