package com.college.timetable.dto.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubjectMappingResponse {
    private Long id;
    private Long facultyId;
    private String facultyName;
    private Long subjectId;
    private String subjectCode;
    private String subjectName;
    private String approvalStatus;
    private String rejectionReason;
    private Integer preferenceLevel;
    private LocalDateTime submissionDate;
    private LocalDateTime approvalDate;
}