package com.CAT.StudentManagement.courses;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    int id;
    String courseName;

    public Course(int id, String courseName) {
        this.id = id;
        this.courseName = courseName;
    }

    public Course() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
