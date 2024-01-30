package com.example.taskhashmap.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.taskhashmap.entity.Student;
import com.example.taskhashmap.exceptions.ApiException;

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

    @Test
    public void addStudentWithSameIdThrowException() {
        Integer id = 1;
        String name = "Harsh";
        // add default student
        service.addStudent(id, name);

        Integer duplicateId = 1;
        assertThrows(ApiException.class,() -> service.addStudent(duplicateId, name));
    }

    @Test
    public void getStudent() {
        Integer id = 1;
        String name = "Harsh";
        Student actual = service.addStudent(id, name);

        Student result = service.getStudent(id);
        
        assertNotNull(result);
        assertEquals(actual.getId(), result.getId());
        assertEquals(actual.getName(), result.getName());
    }

    @Test
    public void studentDontExistThrowException() {
        
        assertThrows(ApiException.class,() -> service.getStudent(1));
    }
}
