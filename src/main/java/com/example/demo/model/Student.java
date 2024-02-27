package com.example.demo.model;

public class Student {
    int id;
    String name;
    int age;
    String adhar;
    String university;

    // Constructor
    public Student(String name, int age, String adhar, String university , int id) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adhar = adhar;
        this.university = university;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdhar() {
        return adhar;
    }

    public void setAdhar(String adhar) {
        this.adhar = adhar;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
