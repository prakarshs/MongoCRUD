package com.Practice.MongoCRUD.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentResponse {
    private String message;
    private String studentId;
    private String studentName;
    private Long studentAge;
    private Date studentAddTime;
}
