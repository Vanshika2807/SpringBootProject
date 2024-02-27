package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class StudentService {
    private Map<Integer, Student> students = new HashMap<>();
    private int idCounter = 1;

    public int addStudent(String name, int age, String adhar, String university) {
        int studentId = idCounter++;
        Student student = new Student(name, age, adhar, university, studentId);
        students.put(studentId, student);
        return studentId;
        
    }

    public List<Student> getAllStudentsByUniversity(String university) {
        return students.values().stream()
                .filter(student -> student.getUniversity().equals(university))
                .collect(Collectors.toList());
    }

    public Student getStudentById(int studentId) {
        return students.get(studentId);
    }
}
