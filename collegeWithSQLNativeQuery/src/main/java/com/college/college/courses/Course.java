package com.college.college.courses;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    int id;
    String name;
    int hours;
    public Course(int id, String name, int hours) {
        this.id = id;
        this.name = name;
        this.hours = hours;
    }
    public Course() {
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
