package com.college.timetable.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FacultySubjectRequest {
    @NotNull(message = "Faculty ID is required")
    private Long facultyId;

    @NotNull(message = "Subject ID is required")
    private Long subjectId;

    private Integer preferenceLevel = 1;
}