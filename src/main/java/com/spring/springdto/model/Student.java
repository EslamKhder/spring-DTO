package com.spring.springdto.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private Long id;

    private String name;

    private String age;

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
