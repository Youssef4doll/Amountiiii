package org.example.si.service;

import org.example.si.entity.vehicule;

import java.util.List;

public interface Ivehicule {
    public List<vehicule> retrieveAllVehicules();
    public vehicule retrieveVehicule(Long vehiculeId);
    public vehicule addVehicule(vehicule vehicule);
    public void removeVehicule(Long vehiculeId);
    public vehicule modifyVehicule(vehicule vehicule);
}
