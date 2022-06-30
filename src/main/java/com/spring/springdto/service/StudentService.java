package com.spring.springdto.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springdto.model.Student;
import com.spring.springdto.model.StudentDTO;
import com.spring.springdto.repo.StudentRepo;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public List<StudentDTO> getStudents(){
        List<Student> students = studentRepo.findAll();
        /* [1,ahmed,20] [2,eslam,22] [] []*/ // 10
        List<StudentDTO> studentDTOS = new ArrayList<>();
        for(int i =0;i<students.size();i++){ // 0      9
            StudentDTO studentDTO = new StudentDTO();
            studentDTO.setId(students.get(i).getId());
            studentDTO.setName(students.get(i).getName());
            studentDTOS.add(studentDTO);
        }
        return studentDTOS;
    }
}
