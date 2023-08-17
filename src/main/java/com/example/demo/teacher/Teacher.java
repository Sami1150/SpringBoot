package com.example.demo.teacher;

public class Teacher {
    private int id;
    private String course;
    private int salary;

    public Teacher(int id, String course, int salary) {
        this.id = id;
        this.course = course;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
