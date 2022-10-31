package com.college.college.departments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/departments")
    List<Department> getAllDepartment(){
        return departmentService.getAllDepartment();
    }

    @GetMapping("/departments/{id}")
    Department getDepartmentById(@PathVariable int id){
        return departmentService.getDepartmentById(id);
    }

    @PostMapping("/departments")
    boolean addDepartment(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }

    @PutMapping("/departments")
    boolean updateDepartment(@RequestBody Department department){
        return departmentService.updateDepartment(department);
    }

    @DeleteMapping("/departments/{id}")
    boolean deleteDepartment(@PathVariable int id){
        return departmentService.deleteDepartment(id);
    }
}
