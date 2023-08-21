package com.example.demo.studentdao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.studentmodel.student;

import java.util.List;

//<model, data Type of primary key>
public interface StudentRepository extends JpaRepository<student,Integer> {

    List<student> findByAge(Integer age);
}
