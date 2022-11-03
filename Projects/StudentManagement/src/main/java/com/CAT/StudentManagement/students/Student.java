package com.CAT.StudentManagement.students;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.CAT.StudentManagement.courses.Course;

@Entity
public class Student {
    @Id
    int id;
    String studentName;

    //relationship - one courses to many student
    @ManyToOne
    Course course;
    
    public Student(int id, String studentName, Course course) {
        this.id = id;
        this.studentName = studentName;
        this.course = course;
    }
    public Student() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
}
