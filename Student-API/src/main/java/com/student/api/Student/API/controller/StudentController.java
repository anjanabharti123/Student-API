package com.student.api.Student.API.controller;

import com.student.api.Student.API.models.Student;
import com.student.api.Student.API.service.ExamService;
import com.student.api.Student.API.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @Autowired
    ExamService examServise;

    @PutMapping("/student/marks/update")
    public void  updateMark(@RequestParam String id, @RequestParam int marks){
       studentService.updateStudentResultById(id, marks);
    }

    @GetMapping("/student/marks")
    public Integer studentMarksById(@RequestParam String id){
        return examServise.getStudentResultById(id);
    }
    @GetMapping("/student/details")
    public String getStudents(){
        return "Hello";
    }

    @PostMapping("/student/upload")
    public String uploadStudent(@RequestBody Student student){
        // controller will call the service layer
        System.out.println("request recieved in controller layer");
        studentService.saveStudent(student);
        return "Student got saved";
    }

    @GetMapping("student/detail")
    public Student getStudentDetailsById(@RequestParam String id){
           return studentService.getStudentById(id);
    }

    @PutMapping("/student/detail/update")
    public Student updateStudentId(@RequestParam String id, @RequestBody Student student){
       return studentService.updateStudentById(id, student);
    }
}
