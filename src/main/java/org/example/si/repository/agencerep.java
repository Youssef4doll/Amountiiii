package org.example.si.repository;

import org.example.si.entity.agence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface agencerep extends JpaRepository<agence, Long> {
}
