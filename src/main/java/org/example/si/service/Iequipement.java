package org.example.si.service;

import org.example.si.entity.equipement;

import java.util.List;

public interface Iequipement {
    public List<equipement> retrieveAllEquipements();
    public equipement retrieveEquipement(Long equipementId);
    public equipement addEquipement(equipement equipement);
    public void removeEquipement(Long equipementId);
    public equipement modifyEquipement(equipement equipement);
}
