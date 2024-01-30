package com.example.taskhashmap.services;

import java.util.Optional;

import com.example.taskhashmap.entity.Student;
import com.example.taskhashmap.exceptions.ApiException;

public interface StudentServiceInterface {

    /**
     * Retrieves a student by their ID.
     *
     * @param id The ID of the student to retrieve.
     * @return student.
     * @throws ApiException if a student with the same ID doesn't exists.
     */
    Student getStudent(Integer id);

    /**
     * Adds a new student with the specified ID and name.
     *
     * @param id   The ID of the new student.
     * @param name The name of the new student.
     * @return The newly added student.
     * @throws ApiException if a student with the same ID already exists.
     */
    Student addStudent(Integer id, String name);
    
}
