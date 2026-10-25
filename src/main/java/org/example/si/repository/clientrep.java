package org.example.si.repository;

import org.example.si.entity.client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clientrep extends JpaRepository<client, Long> {
}
