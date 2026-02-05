package com.college.timetable.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FacultyResponse {
    private Long id;
    private String facultyCode;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String phone;
    private String designation;
    private String department;
    private Boolean isActive;
}