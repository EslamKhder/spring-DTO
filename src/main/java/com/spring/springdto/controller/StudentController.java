package com.spring.springdto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springdto.model.Student;
import com.spring.springdto.service.StudentService;

@RestController("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/allStudent")
    public List<Student> getAllStudents(){
        return studentService.getStudents();
    }
}
