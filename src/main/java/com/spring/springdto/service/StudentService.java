package com.spring.springdto.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springdto.model.Course;
import com.spring.springdto.model.CourseResponse;
import com.spring.springdto.model.Student;
import com.spring.springdto.model.StudentDTO;
import com.spring.springdto.model.StudentPositionDto;
import com.spring.springdto.model.StudentResponse;
import com.spring.springdto.repo.CourseRepo;
import com.spring.springdto.repo.StudentRepo;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CourseRepo courseRepo;

    public List<StudentDTO> getStudents(){
        List<Student> students = studentRepo.findAll();
        /* [1,ahmed,20] [2,eslam,22] [] []*/ // 10
        List<StudentDTO> studentDTOS = new ArrayList<>();
        for(int i =0;i<students.size();i++){ // 0      9
            StudentDTO studentDTO = modelMapper.map(students.get(i),StudentDTO.class);
            /*studentDTO.setId(students.get(i).getId());
            studentDTO.setName(students.get(i).getName());*/
            studentDTOS.add(studentDTO);
        }
        return studentDTOS;
    }

    public List<Student> getStudentsAfterR(){
        return studentRepo.findAll();
    }
    public StudentResponse getStudent(Long id){
        Student student = studentRepo.findById(id).get();
        StudentResponse studentResponse = new StudentResponse();
        studentResponse.setPhone("01113903660");
        //studentResponse = modelMapper.map(student,StudentResponse.class);
        modelMapper.map(student,studentResponse);
        return studentResponse;
    }

    public StudentPositionDto getStudentCourses(List<Long> ids) {
        // 0 1 2
        // 1 3 5
        StudentPositionDto studentPositionDto = modelMapper.map(
                courseRepo.findStudentByCourseID(ids.get(0)),StudentPositionDto.class);

        /*Student student = courseRepo.findStudentByCourseID(ids.get(0));
        studentPositionDto.setId(student.getId());
        studentPositionDto.setName(student.getName());*/

        /*List<Course> courses = courseRepo.listCoursesInIds(ids);
        for(int i=0;i<courses.size();i++){
            CourseResponse courseResponse = modelMapper.map(courses.get(i),CourseResponse.class);
            /*courseResponse.setId(courses.get(i).getId());
            courseResponse.setCost(courses.get(i).getCost());
            studentPositionDto.getCourses().add(courseResponse);
        }*/
        return studentPositionDto;
    }
}