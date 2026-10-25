package org.example.si.service;

import lombok.AllArgsConstructor;
import org.example.si.entity.paiement;
import org.example.si.repository.paiementrep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class paiementservice implements Ipaiement {
    paiementrep paiementrep;

    public List<paiement> retrieveAllPaiements() {
        return paiementrep.findAll();
    }

    public paiement retrievePaiement(Long paiementId) {
        return paiementrep.findById(paiementId).get();
    }

    public paiement addPaiement(paiement paiement) {
        return paiementrep.save(paiement);
    }

    public void removePaiement(Long paiementId) {
        paiementrep.deleteById(paiementId);
    }

    public paiement modifyPaiement(paiement paiement) {
        return paiementrep.save(paiement);
    }
}
