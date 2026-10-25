package org.example.si.repository;

import org.example.si.entity.reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface reservationrep extends JpaRepository<reservation, Long> {
}
