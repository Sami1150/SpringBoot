package com.example.demo.student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
public class StudentService {
    public List<Student> getStudents(){
        //Long id, String name, String email, LocalDate dob, Integer age
        return List.of(
                new Student(1,"Mariam","abc1@gmail.com", LocalDate.of(2000, Month.JANUARY,5),20)
        );
    }
}