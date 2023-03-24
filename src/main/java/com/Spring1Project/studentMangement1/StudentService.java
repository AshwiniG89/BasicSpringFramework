package com.Spring1Project.studentMangement1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public String addStudent(Student student){
        return studentRepository.addStudent(student);
    }

    public Student getStudent(int regID){
        return studentRepository.getStudent(regID);
    }

    public String deleteStudent(int regID){
        return studentRepository.deleteStudent(regID);
    }

    public String updateStudent(int regID,int age){
        return studentRepository.updateStudent(regID, age);
    }
}
