package org.example.si.service;

import lombok.AllArgsConstructor;
import org.example.si.entity.equipement;
import org.example.si.repository.equipementrep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class equipementservice implements Iequipement {
    equipementrep equipementrep;

    public List<equipement> retrieveAllEquipements() {
        return equipementrep.findAll();
    }

    public equipement retrieveEquipement(Long equipementId) {
        return equipementrep.findById(equipementId).get();
    }

    public equipement addEquipement(equipement equipement) {
        return equipementrep.save(equipement);
    }

    public void removeEquipement(Long equipementId) {
        equipementrep.deleteById(equipementId);
    }

    public equipement modifyEquipement(equipement equipement) {
        return equipementrep.save(equipement);
    }
}
