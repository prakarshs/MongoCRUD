package com.Practice.MongoCRUD.Service;

import com.Practice.MongoCRUD.DTO.StudentRequest;
import com.Practice.MongoCRUD.DTO.StudentResponse;

public interface StudentService {
    StudentResponse addStudent(StudentRequest studentRequest);

    StudentResponse showStudent(Long studentId);
}
