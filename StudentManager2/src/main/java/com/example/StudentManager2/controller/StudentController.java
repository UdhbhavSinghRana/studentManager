package com.example.StudentManager2.controller;

import com.example.StudentManager2.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class StudentController {

    Map<String, Student> mapIdToStudent = new HashMap<>();
    Map<String, List<Student>> mapUniToStudent = new HashMap<>();

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student) {
        String id = UUID.randomUUID().toString();
        student.setId(id);
        mapIdToStudent.put(id, student);

        List<Student> students = mapUniToStudent.getOrDefault(student.getUni(), new ArrayList<>());
        students.add(student);
        mapUniToStudent.put(student.getUni(), students);

        return id;
    }

    @GetMapping("/getStudentsByUni")
    public List<Student> getStudentsByUni(@RequestParam String uni) {
        return mapUniToStudent.getOrDefault(uni, Collections.emptyList());
    }

    @GetMapping("/getStudentById")
    public Student getStudentById(@RequestParam String id) {
        return mapIdToStudent.getOrDefault(id, null);
    }
}

