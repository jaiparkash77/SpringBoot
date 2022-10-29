package com.college.college.courses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

import com.college.college.departments.Department;

@Entity
public class Course {
    @Id
    int id;
    String name;
    int hours;

    // relationship - many courses to one department
    @ManyToOne
    Department department;

    
    public Course(int id, String name, int hours, Department department) {
        this.id = id;
        this.name = name;
        this.hours = hours;
        this.department = department;
    }
    public Course() {
    }

    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
}
