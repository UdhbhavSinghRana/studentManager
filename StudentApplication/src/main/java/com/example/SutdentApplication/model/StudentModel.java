package com.example.SutdentApplication.model;

import lombok.AllArgsConstructor;
// import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor

public class StudentModel {
    public String id;
    public String name;
    public String age;

    // public StudentModel(String id, String name, String age){
    //     this.id = id;
    //     this.name = name;
    //     this.age = age;
    // }
}


