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
public class TimetableGenerationRequest {
    @NotNull(message = "Requested by faculty ID is required")
    private Long requestedByFacultyId;

    @NotNull(message = "Acadmeic year ID is required")
    private Long academicYearId;

    @NotNull(message = "Generation scope is required")
    private Long generationScope;

    private Long yearLevelId;
    private Long branchId;
    private Long sectionId;
}