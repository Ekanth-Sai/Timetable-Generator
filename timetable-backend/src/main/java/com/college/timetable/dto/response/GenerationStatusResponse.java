package com.college.timetable.dto.response;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GenerationStatusResponse {
    private UUID requestId;
    private String status;
    private String generationScope;
    private LocalDateTime startedAt;
    private LocalDateTime completedAt;
    private String errorMessage;
    private Integer totalSectionsProcessed;
    private Integer successfulSections;
    private Integer failedSections;
    private List<ConflictReportResponse> conflicts;
}