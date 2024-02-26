package com.example.SutdentApplication.service;

import com.example.SutdentApplication.model.StudentModel;
import com.example.SutdentApplication.repository.StudentDataRepo;

import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StudentService {

    @Autowired
    public StudentDataRepo studentDataRepo;

    public String createStudent(final String employeeName, final String employeeAge) {
        String randomId = UUID.randomUUID().toString();
        StudentModel studentDataModel =  studentDataRepo.createStudent(randomId, employeeName, employeeAge);
        return studentDataModel.getId();
    }

    public StudentModel getStudent(final String id) throws BadRequestException {
        StudentModel studentDataModel = studentDataRepo.getStudentById(id);

        if(studentDataModel == null) {
            throw new BadRequestException("Invalid User");
        }

        return studentDataModel;
    }

    public void deleteStudent(final String id) throws BadRequestException {
        // StudentModel studentDataModel = getStudent(id);
        studentDataRepo.deleteStudent(id);
    }

    public StudentModel updateStudent(final String id, final String employeeName, final String employeeAge)
            throws BadRequestException {
        // StudentModel studentDataModel = studentDataRepo.getStudentById(id);
        return studentDataRepo.updateStudent(id, employeeName, employeeAge);
    }
}