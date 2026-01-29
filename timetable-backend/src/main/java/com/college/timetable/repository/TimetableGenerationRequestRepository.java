package com.college.timetable.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.timetable.entity.TimetableGenerationRequest;
import com.college.timetable.entity.TimetableGenerationRequest.GenerationScope;
import com.college.timetable.entity.TimetableGenerationRequest.GenerationStatus;

import java.util.List;

@Repository
public interface TimetableGenerationRequestRepository extends JpaRepository<TimetableGenerationRequest, Long> {
    Optional<TimetableGenerationRequest> findByRequestId(UUID requestId);

    List<TimetableGenerationRequest> findByStatus(GenerationStatus status);

    List<TimetableGenerationRequest> findByGenerationScope(GenerationScope scope);

    List<TimetableGenerationRequest> findByStatusOrderByCreatedAtDesc(GenerationStatus status);

    List<TimetableGenerationRequest> findAllByOrderByCreatedAtDesc();
}