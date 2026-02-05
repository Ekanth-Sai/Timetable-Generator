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
public class ConflictReportResponse {
    private Long id;
    private String conflictType;
    private String severity;
    private String description;
    private String entityType;
    private Long entityId;
    private String resolutionStatus;
    private LocalDateTime createdAt;
}