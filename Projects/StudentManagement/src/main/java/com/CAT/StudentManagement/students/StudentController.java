package com.CAT.StudentManagement.students;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CAT.StudentManagement.courses.Course;
import com.CAT.StudentManagement.courses.CourseService;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @Autowired
    CourseService courseService;

    @GetMapping("/students")
    List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/student/{id}")
    Student getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }

    @PostMapping("/course/{courseId}/student")
    boolean addStudent(@PathVariable Integer courseId,@RequestBody Student student){
        Course currCourse = courseService.getCourseById(courseId);
        student.course = currCourse;
        return studentService.addStudent(student);
    }

    @PutMapping("/student")
    boolean updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/student/{id}")
    boolean deleteStudent(@PathVariable int id){
        return studentService.deleteStudent(id);
    }
}
