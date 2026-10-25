package org.example.si.repository;

import org.example.si.entity.equipement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface equipementrep extends JpaRepository<equipement,Long> {
}
