package com.example.taskhashmap.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.taskhashmap.entity.Student;
import com.example.taskhashmap.exceptions.ApiException;

@Service
public class StudentService implements StudentServiceInterface {

    // MAP => id -> Student
    private Map<Integer, Student> studentMap = new HashMap<>();

    @Override
    public Student getStudent(Integer id) {
        // get the student or null
        Student student = studentMap.get(id);
        if(student == null) {
            // If a student with the same ID already exists, throw a custom exception
            throw new ApiException("Student with ID " + id + " doesn't exists");
        }
        return student;
    }

    @Override
    public Student addStudent(Integer id, String name) {
        if (studentMap.containsKey(id)) {
            // If a student with the same ID already exists, throw a custom exception
            throw new ApiException("Student with ID " + id + " already exists");
        }
    
        Student newStudent = new Student(id, name);
        studentMap.put(id, newStudent);
        return newStudent;
    }

}
