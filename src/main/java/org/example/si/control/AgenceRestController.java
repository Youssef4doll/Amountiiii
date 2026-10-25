package org.example.si.control;

import lombok.AllArgsConstructor;
import org.example.si.entities.Agence;
import org.example.si.service.IAgenceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")
public class AgenceRestController {
    IAgenceService agenceService;

    @GetMapping("/retrieve-all-agences")
    public List<Agence> getAgences() {
        List<Agence> listAgences = agenceService.retrieveAllAgences();
        return listAgences;
    }

    @GetMapping("/retrieve-agence/{agence-id}")
    public Agence retrieveAgence(@PathVariable("agence-id") Long agenceId) {
        Agence agence = agenceService.retrieveAgence(agenceId);
        return agence;
    }

    @PostMapping("/add-agence")
    public Agence addAgence(@RequestBody Agence c) {
        Agence agence = agenceService.addAgence(c);
        return agence;
    }

    @DeleteMapping("/remove-agence/{agence-id}")
    public void removeAgence(@PathVariable("agence-id") Long agenceId) {
        agenceService.removeAgence(agenceId);
    }

    @PutMapping("/modify-agence")
    public Agence modifyAgence(@RequestBody Agence c) {
        Agence agence = agenceService.modifyAgence(c);
        return agence;
    }
}
