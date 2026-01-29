package com.college.timetable.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.timetable.entity.Faculty;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    Optional<Faculty> findByFacultyCode(String facultyCode);

    Optional<Faculty> findByEmail(String email);

    List<Faculty> findByIsActiveTrue();
    List<Faculty> findByDepartment(String department);
}