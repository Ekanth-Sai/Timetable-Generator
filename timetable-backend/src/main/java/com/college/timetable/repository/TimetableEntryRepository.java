package com.college.timetable.repository;

import com.college.timetable.entity.TimetableEntry;
import com.college.timetable.entity.Section;
import com.college.timetable.entity.Faculty;
import com.college.timetable.entity.TimetableGenerationRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.UUID;

@Repository
public interface TimetableEntryRepository extends JpaRepository<TimetableEntry, Long> {
    List<TimetableEntry> findBySection(Section section);

    List<TimetableEntry> findByFaculty(Faculty faculty);

    List<TimetableEntry> findBySectionAndIsActiveTrue(Section section);

    List<TimetableEntry> findByFacultyAndIsActiveTrue(Faculty faculty);

    List<TimetableEntry> findByGenerationRequest(TimetableGenerationRequest request);

    @Query("SELECT te FROM TimetableEntry te WHERE te.section.id = :sectionId AND te.timeSlot.id = :timeSlotId AND te.isActive = true")
    List<TimetableEntry> findBySectionAndTimeSlot(@Param("sectionId") Long sectionId,
            @Param("timeSlotId") Long timeSlotId);

    @Query("SELECT te FROM TimetableEntry te WHERE te.faculty.id = :facultyId AND te.timeSlot.id = :timeSlotId AND te.isActive = true")
    List<TimetableEntry> findByFacultyAndTimeSlot(@Param("facultyId") Long facultyId,
            @Param("timeSlotId") Long timeSlotId);

    @Query("SELECT te FROM TimetableEntry te WHERE te.room.id = :roomId AND te.timeSlot.id = :timeSlotId AND te.isActive = true")
    List<TimetableEntry> findByRoomAndTimeSlot(@Param("roomId") Long roomId, @Param("timeSlotId") Long timeSlotId);

    @Query("SELECT te FROM TimetableEntry te WHERE te.labGroupId = :labGroupId AND te.isActive = true ORDER BY te.labSessionPart")
    List<TimetableEntry> findByLabGroupId(@Param("labGroupId") UUID labGroupId);

    void deleteByGenerationRequest(TimetableGenerationRequest request);
}