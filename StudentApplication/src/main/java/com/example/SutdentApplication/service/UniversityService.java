package com.example.SutdentApplication.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SutdentApplication.model.StudentModel;
import com.example.SutdentApplication.repository.UniversityDataRepo;


@Service
public class UniversityService {

    @Autowired
    public UniversityDataRepo universityDataRepo;

    public ArrayList<StudentModel> getAllStudentOfUniversityByid(String id){
        return universityDataRepo.getAllStudentOfUniversityByid(id);
    }
}
