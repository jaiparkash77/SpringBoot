package com.example.demo.student;

public class Student {
    int rollNumber;
    String name;
    double percentage;
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPercentage() {
        return percentage;
    }
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    public Student(int rollNumber, String name, double percentage) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.percentage = percentage;
    }
}
