package com.student.api.Student.API.service;

import com.student.api.Student.API.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamService {
   @Autowired
    StudentRepository studentRepository;
    public Integer getStudentResultById(String id){
          return studentRepository.getResultById(id);
    }
}
