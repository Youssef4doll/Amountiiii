package org.example.si.service;

import lombok.AllArgsConstructor;
import org.example.si.entities.Paiement;
import org.example.si.repositories.PaiementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PaiementServiceImpl implements IPaiementService {
    PaiementRepository paiementRepository;

    public List<Paiement> retrieveAllPaiements() {
        return paiementRepository.findAll();
    }

    public Paiement retrievePaiement(Long paiementId) {
        return paiementRepository.findById(paiementId).get();
    }

    public Paiement addPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    public void removePaiement(Long paiementId) {
        paiementRepository.deleteById(paiementId);
    }

    public Paiement modifyPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }
}
