package com.select.seat.repository;

import com.select.seat.entity.Appoint;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AppointRepository extends JpaRepository<Appoint, Long> {
}
