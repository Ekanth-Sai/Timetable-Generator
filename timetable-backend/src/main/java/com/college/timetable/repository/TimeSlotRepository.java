package com.college.timetable.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.college.timetable.entity.TimeSlot;
import com.college.timetable.entity.YearLevel;

@Repository
public interface TimeSlotRepository extends JpaRepository<TimeSlot, Long> {
    List<TimeSlot> findByYearLevel(YearLevel yearLevel);

    List<TimeSlot> findByYearLevelAndIsActiveTrue(YearLevel yearLevel);

    List<TimeSlot> findByYearLevelAndDayOfWeek(YearLevel yearLevel, Integer dayOfWeek);

    @Query("SELECT ts FROM TimeSlot ts WHERE ts.yearLevel = :yearLevel AND ts.isLunch = false AND ts.isActive = true ORDER BY ts.dayOfWeek, ts.periodNumber")
    List<TimeSlot> findSchedulableSlots(@Param("yearLevel") YearLevel yearLevel);
    
    @Query("SELECT ts FROM TimeSlot ts WHERE ts.yearLevel = :yearLevel AND ts.dayOfWeek = :day AND ts.periodNumber BETWEEN :startPeriod AND :endPeriod AND ts.isLunch = false AND ts.isActive = true ORDER BY ts.periodNumber")
    List<TimeSlot> findContinuousSlots(@Param("yearLevel") YearLevel yearLevel, @Param("day") Integer day, @Param("startPeriod") Integer startPeriod, @Param("endPeriod") Integer endPeriod);
}