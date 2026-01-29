package com.college.timetable.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.timetable.entity.Branch;
import com.college.timetable.entity.Subject;
import com.college.timetable.entity.YearLevel;
import com.college.timetable.entity.Subject.SubjectType;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
    Optional<Subject> findBySubjectCode(String subjectCode);
    List<Subject> findByYearLevel(YearLevel yearLevel);

    List<Subject> findByBranch(Branch branch);

    List<Subject> findByYearLevelAndBranch(YearLevel yearLevel, Branch branch);

    List<Subject> findByYearLevelAndBranchAndSubjectType(YearLevel yearLevel, Branch branch, SubjectType subjectType);

    List<Subject> findByYearLevelAndBranchAndIsActiveTrue(YearLevel yearLevel, Branch branch);
}