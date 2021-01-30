package com.select.seat.repository;

import com.select.seat.entity.Seat;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
}
