package org.example.si.service;

import org.example.si.entity.paiement;
import org.example.si.repository.paiementrep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class paiementservice implements Ipaiement {

    private final paiementrep paiementrep;

    public paiementservice(paiementrep paiementrep) {
        this.paiementrep = paiementrep;
    }

    public paiement addPaiement(paiement p) {
        return paiementrep.save(p);
    }

    public List<paiement> getAllPaiements() {
        return paiementrep.findAll();
    }

    public paiement getPaiementById(Long id) {
        return paiementrep.findById(id)
                .orElseThrow(() -> new RuntimeException("Paiement not found: " + id));
    }

    public void deletePaiement(Long id) {
        paiementrep.deleteById(id);
    }
}