package org.example.si.service;

import org.example.si.entities.Equipement;

import java.util.List;

public interface IEquipementService {
    public List<Equipement> retrieveAllEquipements();
    public Equipement retrieveEquipement(Long equipementId);
    public Equipement addEquipement(Equipement equipement);
    public void removeEquipement(Long equipementId);
    public Equipement modifyEquipement(Equipement equipement);
}
