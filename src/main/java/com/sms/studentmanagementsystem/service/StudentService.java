package com.sms.studentmanagementsystem.service;

import com.sms.studentmanagementsystem.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void removeStudent(Student student);
}
