package com.example.demo.teacher;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeacherService {
    public List<Teacher> getTeachers(){
        //int id, String course, int salary
        return List.of(
                new Teacher(2, "PakStudies",100),
                new Teacher(3, "Social Studies",200)
        );
    }
}
