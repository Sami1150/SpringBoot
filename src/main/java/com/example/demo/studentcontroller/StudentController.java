package com.example.demo.studentcontroller;
import com.example.demo.studentdao.StudentRepository;
import com.example.demo.studentmodel.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    //Inject you repo here
    @Autowired
    private StudentRepository repo;


    //Method to save a student
    @PostMapping("/saveStudent")
    public String saveStudent(@RequestBody student s){
        repo.save(s);
        return "Student data saved";
    }

    @GetMapping("/getStudent")
    public List<student> GetAllStudents(){
        return repo.findAll();
    }

    @GetMapping("/getStudent/{age}")
    public List<student> GetAllStudentsByAge(@PathVariable Integer age){
        return repo.findByAge(age);
    }

}
