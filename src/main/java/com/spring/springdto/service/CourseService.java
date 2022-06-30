package com.spring.springdto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springdto.model.Course;
import com.spring.springdto.repo.CourseRepo;

@Service
public class CourseService {

    @Autowired
    private CourseRepo courseRepo;

    public List<Course> getCourses(){
        return courseRepo.findAll();
    }
}
