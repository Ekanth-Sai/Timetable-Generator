package com.college.timetable.dto.response;

import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TimetableSlotResponse {
    private Long id;
    private Integer dayOfWeek;
    private String dayName;
    private Integer periodNumber;
    private LocalTime startTime;
    private LocalTime endTime;
    private Boolean isLunch;
    private String subjectCode;
    private String subjectName;
    private String facultyName;
    private String roomNumber;
    private Boolean isLabSession;
    private Integer labSessionPart;
}
