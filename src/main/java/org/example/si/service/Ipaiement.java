package org.example.si.service;

import org.example.si.entity.paiement;

import java.util.List;

public interface Ipaiement {
    public List<paiement> retrieveAllPaiements();
    public paiement retrievePaiement(Long paiementId);
    public paiement addPaiement(paiement paiement);
    public void removePaiement(Long paiementId);
    public paiement modifyPaiement(paiement paiement);
}
