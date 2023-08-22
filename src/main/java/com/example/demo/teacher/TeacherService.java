package com.example.demo.teacher;

import com.example.demo.teacher.Teacher;
import com.example.demo.teacher.TeacherRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
//    public List<Teacher> getTeachers(){
//        //int id, String course, int salary
//        return List.of(
//                new Teacher(2, "PakStudies",100),
//                new Teacher(3, "Social Studies",200)
//        );
//    }
    private final TeacherRepository repository;

    public TeacherService(TeacherRepository repository) {
        this.repository = repository;
    }


    public List<Teacher> findAll() {
        return repository.findAll();
    }
}