package com.sms.studentmanagementsystem;

import com.sms.studentmanagementsystem.entity.Student;
import com.sms.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);

    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

//        Student student1 = new Student("Rui", "Silva", "ruidaniiel@gmail.com");
//        studentRepository.save(student1);
//
//        Student student2 = new Student("Aurora", "Ribeiro", "filiparibeiro214@gmail.com");
//        studentRepository.save(student2);
//
//        Student student3 = new Student("Luna", "Silva", "lunasilva@gmail.com");
//        studentRepository.save(student3);

    }
}
