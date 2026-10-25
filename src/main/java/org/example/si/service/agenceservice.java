package org.example.si.service;

import lombok.AllArgsConstructor;
import org.example.si.entity.agence;
import org.example.si.repository.agencerep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class agenceservice implements Iagence {
    agencerep agencerep;

    public List<agence> retrieveAllAgences() {
        return agencerep.findAll();
    }

    public agence retrieveAgence(Long agenceId) {
        return agencerep.findById(agenceId).get();
    }

    public agence addAgence(agence agence) {
        return agencerep.save(agence);
    }

    public void removeAgence(Long agenceId) {
        agencerep.deleteById(agenceId);
    }

    public agence modifyAgence(agence agence) {
        return agencerep.save(agence);
    }
}
