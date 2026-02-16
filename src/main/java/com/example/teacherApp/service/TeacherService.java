package com.example.teacherApp.service;

import com.example.teacherApp.model.Teacher;
import com.example.teacherApp.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("TeacherService")
public class TeacherService {
    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }


    public Teacher findTeacherById(int id) {
        return teacherRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Teacher not found"));
    }
}


