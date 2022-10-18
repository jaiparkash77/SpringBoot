package com.example.demo.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    List<Student> students = new ArrayList<>();

    StudentController(){
        students.add(new Student(1, "Newton", 99.9));
        students.add(new Student(2, "Jai", 95));
        students.add(new Student(3, "Rakesh", 85.2));
    }

    @GetMapping("/students")
    List<Student> getStudents(){
        return students;
    }

    @PostMapping("/student")
    Student createStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }

    @GetMapping("/student/{rollNumber}")
    Student getStudentByrollNumber(@PathVariable int rollNumber) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).rollNumber == rollNumber) {
                return students.get(i);
            }
        }
        return null;
    }

    @PutMapping("/student")
    boolean updateStudent(@RequestBody Student student) {
        boolean isUpdated = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).rollNumber == student.rollNumber) {
                students.set(i, student);
                isUpdated = true;
                break;
            }
        }
        return isUpdated;
    }

    //    @RequestMapping(method = RequestMethod.DELETE, value = "/students/{rollNumber}")
    @DeleteMapping("/student/{rollNumber}")
    boolean deleteStudent(@PathVariable int rollNumber) {
        boolean isDelete = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).rollNumber == rollNumber) {
                students.remove(i);
                isDelete = true;
                break;
            }
        }
        return isDelete;
    }
}
