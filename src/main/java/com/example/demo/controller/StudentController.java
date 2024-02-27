package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public int addStudent(@RequestParam String name, @RequestParam int age,
                          @RequestParam String adhar, @RequestParam String university) {
        return studentService.addStudent(name, age, adhar, university);
    }

    @GetMapping("/university/{university}")
    public List<Student> getAllStudentsByUniversity(@PathVariable String university) {
        return studentService.getAllStudentsByUniversity(university);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }
}
