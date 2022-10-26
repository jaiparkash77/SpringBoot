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

@RestController
public class CourseController {
    
    @Autowired
    CourseService courseService;

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

    @PostMapping("/courses")
    boolean addCourse(@RequestBody Course course){
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
