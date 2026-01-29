package com.college.timetable.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.timetable.entity.Room;
import com.college.timetable.entity.Room.RoomType;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{
    Optional<Room> findByRoomNumber(String roomNumber);

    List<Room> findByRoomType(RoomType roomType);

    List<Room> findByRoomTypeAndIsAvailaleTrue(RoomType roomType);

    List<Room> findByIsAvailableTrue();
}