package org.example.si.repository;

import org.example.si.entity.maintenance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface maintenancerep extends JpaRepository<maintenance,Long> {
}
