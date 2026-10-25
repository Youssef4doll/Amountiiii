package org.example.si.service;

import org.example.si.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {
    public List<Vehicule> retrieveAllVehicules();
    public Vehicule retrieveVehicule(Long vehiculeId);
    public Vehicule addVehicule(Vehicule vehicule);
    public void removeVehicule(Long vehiculeId);
    public Vehicule modifyVehicule(Vehicule vehicule);
}
