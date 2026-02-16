package com.example.teacherApp.controller;

import com.example.teacherApp.model.Teacher;
import com.example.teacherApp.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @PostMapping("/add")
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        return teacherService.createTeacher(teacher);
    }

    @GetMapping
    public Teacher getTeacherById(@RequestParam(name = "id") int id) {
        Teacher teachers = teacherService.findTeacherById(id);
        return teachers;
    }
}

