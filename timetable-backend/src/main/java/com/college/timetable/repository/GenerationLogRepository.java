package com.college.timetable.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.timetable.entity.GenerationLog;
import com.college.timetable.entity.TimetableGenerationRequest;
import com.college.timetable.entity.GenerationLog.LogLevel;

@Repository
public interface GenerationLogRepository extends JpaRepository<GenerationLog, Long>{
    List<GenerationLog> findByGenerationRequest(TimetableGenerationRequest request);

    List<GenerationLog> findByGenerationRequestAndLogLevel(TimetableGenerationRequest request, LogLevel level);

    List<GenerationLog> findByGenerationRequestOrderByCreatedAsc(TimetableGenerationRequest request);
}