package com.Spring1Project.studentMangement1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
///These says rest API is here
public class StudentController {

    @Autowired
    StudentService studentService;

        // adding Information to student class
    @PostMapping("/add_student")  //end-point for API
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    //get Information
    @GetMapping("/get_student")
    public Student getStudent(@RequestParam("q") int regID){
        return studentService.getStudent(regID);
    }

    @DeleteMapping("delete_student/{regID}")
    public String deleteStudent(@PathVariable("regID") int regID){
       return studentService.deleteStudent(regID);
    }

    @PutMapping("/update_student")
    public String updateStudent(@RequestParam ("regID") int regID,@RequestParam("age") int age){
         return studentService.updateStudent(regID,age);
    }
}

//////////////////////////////////////////
/* complete URL form
addStudent

localhost:8080/add_Student

8080 is default Tomcat port in local server
/add_Student is the end point given by us

getStudent
localhost:8080/get_Student?q=regID


*/
/////////////////////////////////////////////