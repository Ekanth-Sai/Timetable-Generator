package com.college.timetable.repository;

import com.college.timetable.entity.FacultySubjectMapping;
import com.college.timetable.entity.Faculty;
import com.college.timetable.entity.Subject;
import com.college.timetable.entity.FacultySubjectMapping.ApprovalStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface FacultySubjectMappingRepository extends JpaRepository<FacultySubjectMapping, Long> {
    List<FacultySubjectMapping> findByFaculty(Faculty faculty);

    List<FacultySubjectMapping> findBySubject(Subject subject);

    List<FacultySubjectMapping> findByApprovalStatus(ApprovalStatus status);

    Optional<FacultySubjectMapping> findByFacultyAndSubject(Faculty faculty, Subject subject);

    List<FacultySubjectMapping> findByFacultyAndApprovalStatus(Faculty faculty, ApprovalStatus status);

    List<FacultySubjectMapping> findBySubjectAndApprovalStatus(Subject subject, ApprovalStatus status);

    @Query("SELECT fsm FROM FacultySubjectMapping fsm WHERE fsm.subject.id = :subjectId AND fsm.approvalStatus = 'APPROVED'")
    List<FacultySubjectMapping> findApprovedFacultiesForSubject(@Param("subjectId") Long subjectId);

    @Query("SELECT fsm FROM FacultySubjectMapping fsm WHERE fsm.faculty.id = :facultyId AND fsm.approvalStatus = 'APPROVED'")
    List<FacultySubjectMapping> findApprovedSubjectsForFaculty(@Param("facultyId") Long facultyId);
}