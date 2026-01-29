package com.college.timetable.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.timetable.entity.YearLevel;

@Repository
public interface YearLevelRepository extends JpaRepository<YearLevel, Long> {
    Optional<YearLevel> findByYearNumber(Integer yearNumber);
}