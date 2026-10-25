package org.example.si.controller;

import lombok.AllArgsConstructor;
import org.example.si.entity.contrat;
import org.example.si.service.Icontrat;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/contrat")
public class contratcontroller {
    Icontrat contratService;

    @GetMapping("/retrieve-all-contrats")
    public List<contrat> getContrats() {
        List<contrat> listContrats = contratService.retrieveAllContrats();
        return listContrats;
    }

    @GetMapping("/retrieve-contrat/{contrat-id}")
    public contrat retrieveContrat(@PathVariable("contrat-id") Long contratId) {
        contrat contrat = contratService.retrieveContrat(contratId);
        return contrat;
    }

    @PostMapping("/add-contrat")
    public contrat addContrat(@RequestBody contrat c) {
        contrat contrat = contratService.addContrat(c);
        return contrat;
    }

    @DeleteMapping("/remove-contrat/{contrat-id}")
    public void removeContrat(@PathVariable("contrat-id") Long contratId) {
        contratService.removeContrat(contratId);
    }

    @PutMapping("/modify-contrat")
    public contrat modifyContrat(@RequestBody contrat c) {
        contrat contrat = contratService.modifyContrat(c);
        return contrat;
    }
}
