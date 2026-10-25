package org.example.si.controller;

import lombok.AllArgsConstructor;
import org.example.si.entity.vehicule;
import org.example.si.service.Ivehicule;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicule")
public class vehiculecontroller {
    Ivehicule vehiculeService;

    @GetMapping("/retrieve-all-vehicules")
    public List<vehicule> getVehicules() {
        List<vehicule> listVehicules = vehiculeService.retrieveAllVehicules();
        return listVehicules;
    }

    @GetMapping("/retrieve-vehicule/{vehicule-id}")
    public vehicule retrieveVehicule(@PathVariable("vehicule-id") Long vehiculeId) {
        vehicule vehicule = vehiculeService.retrieveVehicule(vehiculeId);
        return vehicule;
    }

    @PostMapping("/add-vehicule")
    public vehicule addVehicule(@RequestBody vehicule c) {
        vehicule vehicule = vehiculeService.addVehicule(c);
        return vehicule;
    }

    @DeleteMapping("/remove-vehicule/{vehicule-id}")
    public void removeVehicule(@PathVariable("vehicule-id") Long vehiculeId) {
        vehiculeService.removeVehicule(vehiculeId);
    }

    @PutMapping("/modify-vehicule")
    public vehicule modifyVehicule(@RequestBody vehicule c) {
        vehicule vehicule = vehiculeService.modifyVehicule(c);
        return vehicule;
    }
}
