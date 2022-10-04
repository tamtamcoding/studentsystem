package com.rustamproject.studentsystem.service;

import com.rustamproject.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
