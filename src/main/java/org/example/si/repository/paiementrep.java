package org.example.si.repository;

import org.example.si.entity.paiement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface paiementrep extends JpaRepository<paiement,Long> {
}
