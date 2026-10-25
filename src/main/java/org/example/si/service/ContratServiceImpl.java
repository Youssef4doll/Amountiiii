package org.example.si.service;

import lombok.AllArgsConstructor;
import org.example.si.entities.Contrat;
import org.example.si.repositories.ContratRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratServiceImpl implements IContratService {
    ContratRepository contratRepository;

    public List<Contrat> retrieveAllContrats() {
        return contratRepository.findAll();
    }

    public Contrat retrieveContrat(Long contratId) {
        return contratRepository.findById(contratId).get();
    }

    public Contrat addContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    public void removeContrat(Long contratId) {
        contratRepository.deleteById(contratId);
    }

    public Contrat modifyContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }
}
