package com.CAT.StudentManagement.students;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();
    }

    public boolean addStudent(Student student) {
        studentRepository.save(student);
        return true;
    }

    public boolean updateStudent(Student student) {
        studentRepository.save(student);
        return true;
    }

    public boolean deleteStudent(int id) {
        studentRepository.deleteById(id);
        return true;
    }
}
