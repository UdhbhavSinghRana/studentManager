package com.example.SutdentApplication.resource;

import com.example.SutdentApplication.model.StudentModel;
import com.example.SutdentApplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class Student {
    
    @Autowired
    private StudentService studentService;

    @GetMapping("/get/{id}")
    public StudentModel getStudent(@PathVariable String id) throws Exception {
        return studentService.getStudent(id);
    }

    @PostMapping("/create/{name}/{age}")
    public String createStudent(@PathVariable String name, @PathVariable String age) {
        return studentService.createStudent(name, age);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable String id) throws Exception {
        studentService.deleteStudent(id);
    }

    @PutMapping("/update/{id}/{name}/{age}")
    public StudentModel updateStudent(@PathVariable String id , @PathVariable String name,
                                            @PathVariable String age) throws Exception {
        return  studentService.updateStudent(id, name, age);
    }

    
}