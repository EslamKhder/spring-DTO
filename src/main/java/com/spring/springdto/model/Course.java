package com.spring.springdto.model;

import javax.persistence.Id;

public class Course {
    @Id
    private Long id;

    private String name;

    private String cost;

    private String time;
}
