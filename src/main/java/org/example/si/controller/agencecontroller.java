package org.example.si.controller;

import lombok.AllArgsConstructor;
import org.example.si.entity.agence;
import org.example.si.service.Iagence;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")
public class agencecontroller {
    Iagence agenceService;

    @GetMapping("/retrieve-all-agences")
    public List<agence> getAgences() {
        List<agence> listAgences = agenceService.retrieveAllAgences();
        return listAgences;
    }

    @GetMapping("/retrieve-agence/{agence-id}")
    public agence retrieveAgence(@PathVariable("agence-id") Long agenceId) {
        agence agence = agenceService.retrieveAgence(agenceId);
        return agence;
    }

    @PostMapping("/add-agence")
    public agence addAgence(@RequestBody agence c) {
        agence agence = agenceService.addAgence(c);
        return agence;
    }

    @DeleteMapping("/remove-agence/{agence-id}")
    public void removeAgence(@PathVariable("agence-id") Long agenceId) {
        agenceService.removeAgence(agenceId);
    }

    @PutMapping("/modify-agence")
    public agence modifyAgence(@RequestBody agence c) {
        agence agence = agenceService.modifyAgence(c);
        return agence;
    }
}
