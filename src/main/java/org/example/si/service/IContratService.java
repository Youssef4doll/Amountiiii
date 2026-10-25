package org.example.si.service;

import org.example.si.entities.Contrat;

import java.util.List;

public interface IContratService {
    public List<Contrat> retrieveAllContrats();
    public Contrat retrieveContrat(Long contratId);
    public Contrat addContrat(Contrat contrat);
    public void removeContrat(Long contratId);
    public Contrat modifyContrat(Contrat contrat);
}
