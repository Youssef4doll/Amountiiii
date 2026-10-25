package org.example.si.service;

import org.example.si.entity.agence;
import org.example.si.repository.agencerep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class agenceservice implements Iagence {

    private final agencerep agenceRepository;

    public agenceservice(agencerep agencerep) {
        this.agenceRepository = agencerep;
    }

    public agence addagence(agence a) {
        return agenceRepository.save(a);
    }

    public List<agence> getAllAgences() {
        return agenceRepository.findAll();
    }

    public agence getAgenceById(Long id) {
        return agenceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Agence not found: " + id));
    }

    public void deleteAgence(Long id) {
        agenceRepository.deleteById(id);
    }
}