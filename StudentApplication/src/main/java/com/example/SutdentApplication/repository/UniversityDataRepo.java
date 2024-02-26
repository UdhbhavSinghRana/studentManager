package com.example.SutdentApplication.repository;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Component;

import com.example.SutdentApplication.model.StudentModel;

@Component
public class UniversityDataRepo {
    private HashMap<String, ArrayList<StudentModel>> universityDataRepo;

    UniversityDataRepo(){
        universityDataRepo = new HashMap<>();
    }

    public ArrayList<StudentModel> getAllStudentOfUniversityByid(String id){
        return universityDataRepo.getOrDefault(id, null);
    }


}
