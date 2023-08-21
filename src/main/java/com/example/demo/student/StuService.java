package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StuService {
    public List<Stu> getStudents(){
        //Long id, String name, String email, LocalDate dob, Integer age
        return List.of(
                new Stu(1,"Mariam","abc1@gmail.com", LocalDate.of(2000, Month.JANUARY,5),20)
        );
    }
}