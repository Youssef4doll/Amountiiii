package org.example.si.service;

import lombok.AllArgsConstructor;
import org.example.si.entity.maintenance;
import org.example.si.repository.maintenancerep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class maintenanceservice implements Imaintenance {
    maintenancerep maintenancerep;

    public List<maintenance> retrieveAllMaintenances() {
        return maintenancerep.findAll();
    }

    public maintenance retrieveMaintenance(Long maintenanceId) {
        return maintenancerep.findById(maintenanceId).get();
    }

    public maintenance addMaintenance(maintenance maintenance) {
        return maintenancerep.save(maintenance);
    }

    public void removeMaintenance(Long maintenanceId) {
        maintenancerep.deleteById(maintenanceId);
    }

    public maintenance modifyMaintenance(maintenance maintenance) {
        return maintenancerep.save(maintenance);
    }
}
