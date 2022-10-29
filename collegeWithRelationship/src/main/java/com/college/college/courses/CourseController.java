package com.college.college.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.college.college.departments.Department;
import com.college.college.departments.DepartmentService;

@RestController
public class CourseController {
    
    @Autowired
    CourseService courseService;

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/courses")
    List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    // Query Parameter -> http://localhost:8080/course?mark=10
    // @GetMapping("/course")
    // List<Course> getAllCoursesByQuery(@RequestParam(required = false) Integer mark){
    //     System.out.println(mark);
    //     return courseService.getAllCourses();
    // }

    @GetMapping("/courses/{id}")
    Course getCourseById(@PathVariable int id){
        return courseService.getCourseById(id);
    }

    // http://localhost:8080/department/1/course -> course is mapping to department 1
    @PostMapping("/department/{deptId}/course")
    boolean addCourse(@PathVariable Integer deptId, @RequestBody Course course){
        Department currDept = departmentService.getDepartmentById(deptId);
        course.department = currDept;
        return courseService.addCourse(course);
    }

    @PutMapping("/courses")
    boolean updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{id}")
    boolean deleteCourse(@PathVariable int id){
        return courseService.deleteCourse(id);
    }
}
