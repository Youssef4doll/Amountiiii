package org.example.si.service;

import org.example.si.entity.vehicule;
import org.example.si.repository.vehiculerep;
import org.springframework.stereotype.Service;

import java.util.List;

public class vehiculeservice implements Ivehicule {

    private final vehiculerep vehiculerep;

    public vehiculeservice(vehiculerep clientrep) {
        this.vehiculerep = clientrep;
    }
    public vehicule addvehicule(vehicule m) {
        return vehiculerep.save(m);
    }

    public List<vehicule> getallvehicule() {

        return vehiculerep.findAll();
    }
    public vehicule getvehiculebyid (Long id) {
        return vehiculerep.findById(id)
                .orElseThrow(() -> new RuntimeException("Client not found: " + id));
    }

    public void vehiculeclinet(Long id) {
        vehiculerep.deleteById(id);
    }
}


