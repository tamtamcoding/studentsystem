package com.rustamproject.studentsystem.controller;

import com.rustamproject.studentsystem.model.Student;
import com.rustamproject.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/student")
    @CrossOrigin
    public class StudentController {
        @Autowired
        private StudentService studentService;

        @PostMapping("/add")
        public String add(@RequestBody Student student){
            studentService.saveStudent(student);
            return "New student is added";
        }

        @GetMapping("/getAll")
        public List<Student> list(){
            return studentService.getAllStudents();
        }

        //check working or not
        @GetMapping ("/hello")
        public String hello(){
            return "hello peeps";
        }
    }
