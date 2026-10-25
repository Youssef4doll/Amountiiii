package org.example.si.service;

import org.example.si.entity.contrat;

import java.util.List;

public interface Icontrat {
    public List<contrat> retrieveAllContrats();
    public contrat retrieveContrat(Long contratId);
    public contrat addContrat(contrat contrat);
    public void removeContrat(Long contratId);
    public contrat modifyContrat(contrat contrat);
}
