package org.example.si.service;

import org.example.si.entity.agence;
import java.util.List;

public interface Iagence {
    agence addagence(agence a);
    List<agence> getAllAgences();
    agence getAgenceById(Long id);
    void deleteAgence(Long id);
}