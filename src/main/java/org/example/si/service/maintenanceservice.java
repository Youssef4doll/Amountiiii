package org.example.si.service;

import org.example.si.entity.maintenance;
import org.example.si.repository.maintenancerep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class maintenanceservice implements Imaintenance {

    private final maintenancerep maintenancerep;

    public maintenanceservice(maintenancerep maintenancerep) {
        this.maintenancerep = maintenancerep;
    }

    public maintenance addMaintenance(maintenance m) {
        return maintenancerep.save(m);
    }

    public List<maintenance> getAllMaintenances() {
        return maintenancerep.findAll();
    }

    public maintenance getMaintenanceById(Long id) {
        return maintenancerep.findById(id)
                .orElseThrow(() -> new RuntimeException("Maintenance not found: " + id));
    }

    public void deleteMaintenance(Long id) {
        maintenancerep.deleteById(id);
    }
}