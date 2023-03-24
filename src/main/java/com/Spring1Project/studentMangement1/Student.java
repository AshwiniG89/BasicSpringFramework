package com.Spring1Project.studentMangement1;

public class Student {

    private String name;
    private int age;
    private int regID;
    private String state;

    public Student(String name, int age, int regID, String state) {
        this.name = name;
        this.age = age;
        this.regID = regID;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRegID() {
        return regID;
    }

    public void setRegID(int regID) {
        this.regID = regID;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
