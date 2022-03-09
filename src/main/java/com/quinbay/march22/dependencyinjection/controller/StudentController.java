package com.quinbay.march22.dependencyinjection.controller;


import com.quinbay.march22.dependencyinjection.config.Response;
import com.quinbay.march22.dependencyinjection.dto.Student;
import com.quinbay.march22.dependencyinjection.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
//    Integer number1;

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudent(){
        return studentService.getAllStudents();
    }



    @GetMapping
    public Student getStudent(
            @RequestParam(required = true) Long id,
            @RequestParam(required = true) String fName
    )
    {

//        {
//            if (fName != null ) {
//                return    new Response<Student>(studentService.getStudent(id, fName));
//            }
//            return new Response<Student>("error", "message");
//        }


        return studentService.getStudent(id, fName);
    }

    @PostMapping
    public void addStudent(
            @RequestBody @Valid Student student,
            @RequestParam Integer number
    ){

        studentService.addStudent(student, number);
    }

    @DeleteMapping
    public void deleteStudent(@RequestParam Long id, @RequestParam Integer number){
        studentService.deleteStudent(id, number);
    }

    @PutMapping
    public Student updateStudent(@RequestBody @Valid Student student, @RequestParam Integer number){


        Student s = studentService.updateStudent(student, number);
        return s;
    }
}
