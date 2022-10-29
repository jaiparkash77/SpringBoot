package com.college.college.departments;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
    @Id
    int id;
    String name;
    int staffCount;
    public Department(int id, String name, int staffCount) {
        this.id = id;
        this.name = name;
        this.staffCount = staffCount;
    }
    public Department() {
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
    public int getStaffCount() {
        return staffCount;
    }
    public void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }
}
