package org.example.si.repository;

import org.example.si.entity.vehicule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface vehiculerep extends JpaRepository <vehicule ,Long> {
}
