package com.maharjan.amit.SpringSecurityDemo.controllers;

import com.maharjan.amit.SpringSecurityDemo.models.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Amit", 80),
            new Student(2, "Kiran", 60)
    ));

    @GetMapping
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }
}
