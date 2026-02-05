package com.college.timetable.dto.response;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TimetableResponse {
    private Long sectionId;
    private String sectionName;
    private Integer yearNumber;
    private String branchCode;
    private String branchName;
    private Map<Integer, List<TimetableSlotResponse>> weeklySchedule;
}