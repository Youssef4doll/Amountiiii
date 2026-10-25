package org.example.si.service;

import org.example.si.entity.equipement;
import org.example.si.repository.equipementrep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class equipementservice implements Iequipement {

    private final equipementrep equipementrep;

    public equipementservice(equipementrep equipementrep) {
        this.equipementrep = equipementrep;
    }

    public equipement addEquipement(equipement e) {
        return equipementrep.save(e);
    }

    public List<equipement> getAllEquipements() {
        return equipementrep.findAll();
    }

    public equipement getEquipementById(Long id) {
        return equipementrep.findById(id)
                .orElseThrow(() -> new RuntimeException("Equipement not found: " + id));
    }

    public void deleteEquipement(Long id) {
        equipementrep.deleteById(id);
    }
}