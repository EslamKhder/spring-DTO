package com.spring.springdto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springdto.model.Student;
import com.spring.springdto.model.StudentDTO;
import com.spring.springdto.model.StudentResponse;
import com.spring.springdto.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/allStudent")
    public List<StudentDTO> getAllStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/allStudentR")
    public List<Student> getAllStudentsAfterR(){
        return studentService.getStudentsAfterR();
    }

    // http://localhost:8080/student/getStudent?id_student=1
    @GetMapping("/getStudent")
    public StudentResponse getStudent(@RequestParam("id_student") Long id){
        return studentService.getStudent(id);
    }

}