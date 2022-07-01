package com.spring.springdto.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.springdto.model.Course;
import com.spring.springdto.model.Student;

@Repository
public interface CourseRepo extends JpaRepository<Course,Long> {
    @Query("select c.student from Course c where c.id = ?1")
    public Student findStudentByCourseID(Long id);

    @Query("select c from Course c where c.id in (:coursesId)")
    public List<Course> listCoursesInIds(List<Long> coursesId);
}
