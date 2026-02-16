package com.example.teacherApp.model;


import jdk.jfr.DataAmount;

import javax.persistence.*;


@Entity
public class ClassRoom {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true)
    private String classroomNumber;

}
