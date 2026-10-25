package org.example.si.service;

import lombok.AllArgsConstructor;
import org.example.si.entities.Agence;
import org.example.si.repositories.AgenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AgenceServiceImpl implements IAgenceService {
    AgenceRepository agenceRepository;

    public List<Agence> retrieveAllAgences() {
        return agenceRepository.findAll();
    }

    public Agence retrieveAgence(Long agenceId) {
        return agenceRepository.findById(agenceId).get();
    }

    public Agence addAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    public void removeAgence(Long agenceId) {
        agenceRepository.deleteById(agenceId);
    }

    public Agence modifyAgence(Agence agence) {
        return agenceRepository.save(agence);
    }
}
