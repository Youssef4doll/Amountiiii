package org.example.si.service;

import org.example.si.entity.maintenance;

import java.util.List;

public interface Imaintenance {
    public List<maintenance> retrieveAllMaintenances();
    public maintenance retrieveMaintenance(Long maintenanceId);
    public maintenance addMaintenance(maintenance maintenance);
    public void removeMaintenance(Long maintenanceId);
    public maintenance modifyMaintenance(maintenance maintenance);
}
