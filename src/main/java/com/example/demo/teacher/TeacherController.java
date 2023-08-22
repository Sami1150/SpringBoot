package com.example.demo.teacher;


import com.example.demo.student.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "api/v2/teacher")
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

//    @GetMapping
//    public List<Teacher> getTeachers(){
//        return teacherService.getTeachers();
//    }
    @GetMapping
    public ResponseEntity<Map<String, List<Teacher>>> findAll(){
        List<Teacher> teachers = teacherService.findAll();
        if (teachers.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(Map.of("content", teachers));
    }
}
