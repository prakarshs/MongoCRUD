package com.Practice.MongoCRUD.Service;

import com.Practice.MongoCRUD.Collections.Students;
import com.Practice.MongoCRUD.DTO.StudentRequest;
import com.Practice.MongoCRUD.DTO.StudentResponse;
import com.Practice.MongoCRUD.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;

@Service
public class StudentServiceIMPL implements StudentService{

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public StudentResponse addStudent(StudentRequest studentRequest) {

        Students students = Students.builder()
                .studentName(studentRequest.getStudentName())
                .studentAge(studentRequest.getStudentAge())
                .studentAddTime(Date.from(Instant.now()))
                .build();

        studentRepository.save(students);

        return StudentResponse.builder()
                .studentId(students.getStudentId())
                .message("THE STUDENT WAS ADDED")
                .studentName(students.getStudentName())
                .studentAge(students.getStudentAge())
                .studentAddTime(students.getStudentAddTime())
                .build();
    }

    @Override
    public StudentResponse showStudent(Long studentId) {

        Students students = studentRepository.findById(studentId).orElseThrow(()->new RuntimeException("StudentID Doesnt Exist"));

        return StudentResponse.builder()
                .studentId(students.getStudentId())
                .message("THIS IS THE STUDENT REQUESTED")
                .studentName(students.getStudentName())
                .studentAge(students.getStudentAge())
                .studentAddTime(students.getStudentAddTime())
                .build();
    }
}
