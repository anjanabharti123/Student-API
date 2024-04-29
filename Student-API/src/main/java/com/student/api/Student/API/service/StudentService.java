package com.student.api.Student.API.service;

import com.student.api.Student.API.models.Student;
import com.student.api.Student.API.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public void saveStudent(Student student){
        System.out.println("Student object recieved in service layer");
       studentRepository.saveStudent(student);
       System.out.println("Student got saved in db");
    }
     public void updateStudentResultById(String id, int marks){
         studentRepository.updateStudentResultById(id, marks);
     }
    public Student getStudentById(String id){
        return studentRepository.getStudentById(id);
    }

    public Student updateStudentById(String id, Student student){
        return studentRepository.updateStudentById(id, student);
    }
}
