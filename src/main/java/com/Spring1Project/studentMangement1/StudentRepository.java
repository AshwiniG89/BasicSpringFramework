package com.Spring1Project.studentMangement1;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {

    Map<Integer,Student> dB = new HashMap<>();

    public Student getStudent(int regID){
        return dB.get(regID);
    }
    public String addStudent(Student student){
        int regID = student.getRegID();
        dB.put(regID,student);
        return "Added Successfully";
    }
    public String deleteStudent(int regID){
        if(!dB.containsKey(regID)){
            return "Invalid regID";
        }
        dB.remove(regID);
        return "Removed Successfully";
    }
    public String updateStudent(int regID,int age){
        if(!dB.containsKey(regID)){
            return "Invalid regID";
        }
        dB.get(regID).setAge(age);
        return "Updated";
    }

}
