package org.example.si.controller;

import lombok.AllArgsConstructor;
import org.example.si.entity.equipement;
import org.example.si.service.Iequipement;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipement")
public class equipementcontroller {
    Iequipement equipementService;

    @GetMapping("/retrieve-all-equipements")
    public List<equipement> getEquipements() {
        List<equipement> listEquipements = equipementService.retrieveAllEquipements();
        return listEquipements;
    }

    @GetMapping("/retrieve-equipement/{equipement-id}")
    public equipement retrieveEquipement(@PathVariable("equipement-id") Long equipementId) {
        equipement equipement = equipementService.retrieveEquipement(equipementId);
        return equipement;
    }

    @PostMapping("/add-equipement")
    public equipement addEquipement(@RequestBody equipement c) {
        equipement equipement = equipementService.addEquipement(c);
        return equipement;
    }

    @DeleteMapping("/remove-equipement/{equipement-id}")
    public void removeEquipement(@PathVariable("equipement-id") Long equipementId) {
        equipementService.removeEquipement(equipementId);
    }

    @PutMapping("/modify-equipement")
    public equipement modifyEquipement(@RequestBody equipement c) {
        equipement equipement = equipementService.modifyEquipement(c);
        return equipement;
    }
}
