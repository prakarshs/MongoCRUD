package com.Practice.MongoCRUD.Service;

import com.Practice.MongoCRUD.Collections.Students;
import com.Practice.MongoCRUD.DTO.StudentRequest;
import com.Practice.MongoCRUD.DTO.StudentResponse;

import java.util.List;

public interface StudentService {
    StudentResponse addStudent(StudentRequest studentRequest);

    StudentResponse showStudent(String studentId);

    List<Students> showAllStudents();

    List<Students> deleteStudent(String studentId);
}
