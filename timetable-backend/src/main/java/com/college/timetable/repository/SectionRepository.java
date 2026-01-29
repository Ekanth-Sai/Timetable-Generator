package com.college.timetable.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.timetable.entity.Branch;
import com.college.timetable.entity.Section;
import com.college.timetable.entity.YearLevel;

@Repository
public interface SectionRepository extends JpaRepository<Section, Long> {
    List<Section> findByYearLevel(YearLevel yearLevel);

    List<Section> findByBranch(Branch branch);

    List<Section> findByYearLevelAndBranch(YearLevel yearLevel, Branch branch);

    Optional<Section> findByYearLevelAndBranchAndSectionName(YearLevel yearLevel, Branch branch, String sectionName);

    List<Section> findByIsActiveTrue(); 
}