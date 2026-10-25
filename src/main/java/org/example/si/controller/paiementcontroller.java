package org.example.si.controller;

import lombok.AllArgsConstructor;
import org.example.si.entity.paiement;
import org.example.si.service.Ipaiement;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/paiement")
public class paiementcontroller {
    Ipaiement paiementService;

    @GetMapping("/retrieve-all-paiements")
    public List<paiement> getPaiements() {
        List<paiement> listPaiements = paiementService.retrieveAllPaiements();
        return listPaiements;
    }

    @GetMapping("/retrieve-paiement/{paiement-id}")
    public paiement retrievePaiement(@PathVariable("paiement-id") Long paiementId) {
        paiement paiement = paiementService.retrievePaiement(paiementId);
        return paiement;
    }

    @PostMapping("/add-paiement")
    public paiement addPaiement(@RequestBody paiement c) {
        paiement paiement = paiementService.addPaiement(c);
        return paiement;
    }

    @DeleteMapping("/remove-paiement/{paiement-id}")
    public void removePaiement(@PathVariable("paiement-id") Long paiementId) {
        paiementService.removePaiement(paiementId);
    }

    @PutMapping("/modify-paiement")
    public paiement modifyPaiement(@RequestBody paiement c) {
        paiement paiement = paiementService.modifyPaiement(c);
        return paiement;
    }
}
