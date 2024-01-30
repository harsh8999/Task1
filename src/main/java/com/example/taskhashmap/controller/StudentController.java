package com.example.taskhashmap.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.taskhashmap.entity.Student;
import com.example.taskhashmap.services.StudentServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class StudentController {

    @Autowired
    private StudentServiceInterface studentServiceInterface;

    @PostMapping("/student")
    public ResponseEntity<Student> postMethodName(@RequestBody Student student) {
        Student newStudent = studentServiceInterface.addStudent(student.getId(), student.getName());
        return new ResponseEntity<Student>(newStudent, HttpStatus.CREATED);
    }
    
    
    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Integer id) {
        Student student = studentServiceInterface.getStudent(id);
        return new ResponseEntity<Student>(student, HttpStatus.OK);
    }
    
}
