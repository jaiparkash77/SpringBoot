package com.college.college.departments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public List<Department> getAllDepartment() {
        return (List<Department>) departmentRepository.findAll();
    }

    public Department getDepartmentById(int id) {
        return departmentRepository.findById(id).get();
    }

    public boolean addDepartment(Department department) {
        departmentRepository.save(department);
        return true;
    }

    public boolean updateDepartment(Department department) {
        departmentRepository.save(department);
        return true;
    }

    public boolean deleteDepartment(int id) {
        departmentRepository.deleteById(id);
        return true;
    }
    
}
