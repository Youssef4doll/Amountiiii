package org.example.si.service;

import org.example.si.entity.agence;

import java.util.List;

public interface Iagence {
    public List<agence> retrieveAllAgences();
    public agence retrieveAgence(Long agenceId);
    public agence addAgence(agence agence);
    public void removeAgence(Long agenceId);
    public agence modifyAgence(agence agence);
}
