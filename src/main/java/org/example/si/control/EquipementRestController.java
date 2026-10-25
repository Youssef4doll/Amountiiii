package org.example.si.control;

import lombok.AllArgsConstructor;
import org.example.si.entities.Equipement;
import org.example.si.service.IEquipementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipement")
public class EquipementRestController {
    IEquipementService equipementService;

    @GetMapping("/retrieve-all-equipements")
    public List<Equipement> getEquipements() {
        List<Equipement> listEquipements = equipementService.retrieveAllEquipements();
        return listEquipements;
    }

    @GetMapping("/retrieve-equipement/{equipement-id}")
    public Equipement retrieveEquipement(@PathVariable("equipement-id") Long equipementId) {
        Equipement equipement = equipementService.retrieveEquipement(equipementId);
        return equipement;
    }

    @PostMapping("/add-equipement")
    public Equipement addEquipement(@RequestBody Equipement c) {
        Equipement equipement = equipementService.addEquipement(c);
        return equipement;
    }

    @DeleteMapping("/remove-equipement/{equipement-id}")
    public void removeEquipement(@PathVariable("equipement-id") Long equipementId) {
        equipementService.removeEquipement(equipementId);
    }

    @PutMapping("/modify-equipement")
    public Equipement modifyEquipement(@RequestBody Equipement c) {
        Equipement equipement = equipementService.modifyEquipement(c);
        return equipement;
    }
}
