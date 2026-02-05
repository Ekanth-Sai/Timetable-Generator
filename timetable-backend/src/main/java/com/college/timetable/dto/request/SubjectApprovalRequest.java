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
public class SubjectApprovalRequest {
    @NotNull(message = "Mapping ID is required")
    private Long mappingId;

    @NotNull(message = "Approval status is required")
    private String approvalStatus; //Approved or Rejected

    private String rejectionReason;

    @NotNull(message = "Approved by faculty ID is required")
    private Long approvedByFacultyId;
}