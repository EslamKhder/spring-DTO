package com.spring.springdto.model;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Student {

    @Id
    private Long id;

    private String name;

    private String age;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "student")
    private List<Course> courses;

    // 50 pro

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
