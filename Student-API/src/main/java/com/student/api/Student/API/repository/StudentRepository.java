package com.student.api.Student.API.repository;

import com.student.api.Student.API.models.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class StudentRepository {

    HashMap<String, Student> studentDB = new HashMap<>();
    HashMap<String, Integer> studentResult = new HashMap<>();

    public void saveStudent(Student student){
        System.out.println("Request recieved repository layer");
        String id = student.getId();
        System.out.println("Adding student object in repository layer");
        studentDB.put(id,student);
        System.out.println(studentDB);
        System.out.println("Student got added into the system");
    }

    public Student getStudentById(String id){
        return studentDB.get(id);
    }

    public Integer getResultById(String id){
        return studentResult.get(id);
    }

    public void updateStudentResultById(String id, int marks){
       studentResult.put(id, marks);
    }
    public Student updateStudentById(String id, Student student){
        if(!studentDB.containsKey(id)){
            return null;
        }
        studentDB.put(id, student);
        return studentDB.get(id);
    }
}
