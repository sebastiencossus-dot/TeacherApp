package com.example.teacherApp.repository;

import com.example.teacherApp.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TeacherRepository extends JpaRepository<Teacher, Integer> {



}
