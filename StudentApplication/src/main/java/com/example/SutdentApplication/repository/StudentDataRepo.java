package com.example.SutdentApplication.repository;
import com.example.SutdentApplication.model.StudentModel;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class StudentDataRepo {
    private Map<String, StudentModel> studentDataMap;

    public StudentDataRepo() {
        studentDataMap = new HashMap<>();
    }

    public StudentModel getStudentById(final String id) {
        return studentDataMap.getOrDefault(id, null);
    }

    public void deleteStudent(final String id) {
        studentDataMap.remove(id);
    }

    public StudentModel updateStudent(final String id, final String name, final String age) {
        StudentModel newStudentDataModel = getStudentById(id);
        newStudentDataModel.setAge(age);
        newStudentDataModel.setName(name);
        return newStudentDataModel;
    }

    public StudentModel createStudent(final String id, final String name, final String age) {
        StudentModel newEmployeeDataModel = new StudentModel(id, name, age);
        studentDataMap.put(id, newEmployeeDataModel);
        return newEmployeeDataModel;
    }
}