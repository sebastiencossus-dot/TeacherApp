package com.example.teacherApp.service;

import com.example.teacherApp.model.Teacher;
import com.example.teacherApp.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("TeacherService")
public class TeacherService {
    private static TeacherRepository teacherRepository = null;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }


    public static Teacher findTeacherById(int id) {
        return teacherRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Teacher not found"));
    }

    public void deleteTeacherById(int id) {
        teacherRepository.deleteById(id);
     }

    public Teacher putById(int id, Teacher teacher) {
        Teacher currentTeacher = teacherRepository.findById(id).orElse(null);
         currentTeacher.setFirstName(teacher.getFirstName());
         currentTeacher.setLastName(teacher.getLastName());
         currentTeacher.setEmail(teacher.getEmail());
        return teacherRepository.save(currentTeacher);

    }
}


