package com.Practice.MongoCRUD.Controller;

import com.Practice.MongoCRUD.Collections.Students;
import com.Practice.MongoCRUD.DTO.StudentRequest;
import com.Practice.MongoCRUD.DTO.StudentResponse;
import com.Practice.MongoCRUD.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    private ResponseEntity<StudentResponse> addStudent(@RequestBody StudentRequest studentRequest){
        return new ResponseEntity<>(studentService.addStudent(studentRequest), HttpStatus.OK);
    }

    @GetMapping("/show/{studentId}")
    private ResponseEntity<StudentResponse> showStudent(@PathVariable String studentId){
        return new ResponseEntity<>(studentService.showStudent(studentId), HttpStatus.OK);
    }
    @GetMapping("/show")
    private ResponseEntity<List<Students>> showAllStudents(){
        return new ResponseEntity<>(studentService.showAllStudents(), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{studentId}")
    private ResponseEntity<List<Students>> deleteStudent(@PathVariable String studentId){
        return new ResponseEntity<>(studentService.deleteStudent(studentId), HttpStatus.OK);
    }





}
