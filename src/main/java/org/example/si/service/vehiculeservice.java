package org.example.si.service;

import lombok.AllArgsConstructor;
import org.example.si.entity.vehicule;
import org.example.si.repository.vehiculerep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class vehiculeservice implements Ivehicule {
    vehiculerep vehiculerep;

    public List<vehicule> retrieveAllVehicules() {
        return vehiculerep.findAll();
    }

    public vehicule retrieveVehicule(Long vehiculeId) {
        return vehiculerep.findById(vehiculeId).get();
    }

    public vehicule addVehicule(vehicule vehicule) {
        return vehiculerep.save(vehicule);
    }

    public void removeVehicule(Long vehiculeId) {
        vehiculerep.deleteById(vehiculeId);
    }

    public vehicule modifyVehicule(vehicule vehicule) {
        return vehiculerep.save(vehicule);
    }
}
