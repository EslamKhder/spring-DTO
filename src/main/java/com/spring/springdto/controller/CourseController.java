package com.spring.springdto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springdto.model.Course;
import com.spring.springdto.model.CourseDTO;
import com.spring.springdto.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/allCourses")
    public List<CourseDTO> getAllCourses(){
        return courseService.getCourses();
    }
}
