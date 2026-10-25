package org.example.si.control;

import lombok.AllArgsConstructor;
import org.example.si.entities.Paiement;
import org.example.si.service.IPaiementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/paiement")
public class PaiementRestController {
    IPaiementService paiementService;

    @GetMapping("/retrieve-all-paiements")
    public List<Paiement> getPaiements() {
        List<Paiement> listPaiements = paiementService.retrieveAllPaiements();
        return listPaiements;
    }

    @GetMapping("/retrieve-paiement/{paiement-id}")
    public Paiement retrievePaiement(@PathVariable("paiement-id") Long paiementId) {
        Paiement paiement = paiementService.retrievePaiement(paiementId);
        return paiement;
    }

    @PostMapping("/add-paiement")
    public Paiement addPaiement(@RequestBody Paiement c) {
        Paiement paiement = paiementService.addPaiement(c);
        return paiement;
    }

    @DeleteMapping("/remove-paiement/{paiement-id}")
    public void removePaiement(@PathVariable("paiement-id") Long paiementId) {
        paiementService.removePaiement(paiementId);
    }

    @PutMapping("/modify-paiement")
    public Paiement modifyPaiement(@RequestBody Paiement c) {
        Paiement paiement = paiementService.modifyPaiement(c);
        return paiement;
    }
}
