package com.college.timetable.repository;

import com.college.timetable.entity.ConflictReport;
import com.college.timetable.entity.TimetableGenerationRequest;
import com.college.timetable.entity.ConflictReport.Severity;
import com.college.timetable.entity.ConflictReport.ResolutionStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ConflictReportRepository extends JpaRepository<ConflictReport, Long> {
    List<ConflictReport> findByGenerationRequest(TimetableGenerationRequest request);

    List<ConflictReport> findByGenerationRequestAndSeverity(TimetableGenerationRequest request, Severity severity);

    List<ConflictReport> findByGenerationRequestAndResolutionStatus(TimetableGenerationRequest request, ResolutionStatus status);

    List<ConflictReport> findByResolutionStatus(ResolutionStatus status);
}