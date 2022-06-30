package com.spring.springdto.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    private Long id;

    private String name;

    private String cost;

    private String time;
}
