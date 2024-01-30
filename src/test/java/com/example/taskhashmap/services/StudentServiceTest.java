package com.example.taskhashmap.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.taskhashmap.entity.Student;

@SpringBootTest
public class StudentServiceTest {

    private StudentService service;
    
    @BeforeEach
    public void setup() {
        service = new StudentService();
    }

    @Test
    public void addStudent() {
        Integer id = 1;
        String name = "Harsh";
        Student result = service.addStudent(id, name);

        assertNotNull(result);
        assertEquals(id, result.getId());
        assertEquals(name, result.getName());
    }
}
