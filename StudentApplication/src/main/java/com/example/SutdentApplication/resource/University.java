package com.example.SutdentApplication.resource;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SutdentApplication.model.StudentModel;
import com.example.SutdentApplication.service.UniversityService;

@RestController
@RequestMapping("/university")
public class University {

    @Autowired
    public UniversityService universityService;
    
    @GetMapping("/{id}")
    public ArrayList<StudentModel> getAllStudentOfUniversityByid(@RequestParam String id){
        return universityService.getAllStudentOfUniversityByid(id);
    }
}
