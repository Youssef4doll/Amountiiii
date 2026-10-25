package org.example.si.controller;

import lombok.AllArgsConstructor;
import org.example.si.entity.maintenance;
import org.example.si.service.Imaintenance;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/maintenance")
public class maintenancecontroller {
    Imaintenance maintenanceService;

    @GetMapping("/retrieve-all-maintenances")
    public List<maintenance> getMaintenances() {
        List<maintenance> listMaintenances = maintenanceService.retrieveAllMaintenances();
        return listMaintenances;
    }

    @GetMapping("/retrieve-maintenance/{maintenance-id}")
    public maintenance retrieveMaintenance(@PathVariable("maintenance-id") Long maintenanceId) {
        maintenance maintenance = maintenanceService.retrieveMaintenance(maintenanceId);
        return maintenance;
    }

    @PostMapping("/add-maintenance")
    public maintenance addMaintenance(@RequestBody maintenance c) {
        maintenance maintenance = maintenanceService.addMaintenance(c);
        return maintenance;
    }

    @DeleteMapping("/remove-maintenance/{maintenance-id}")
    public void removeMaintenance(@PathVariable("maintenance-id") Long maintenanceId) {
        maintenanceService.removeMaintenance(maintenanceId);
    }

    @PutMapping("/modify-maintenance")
    public maintenance modifyMaintenance(@RequestBody maintenance c) {
        maintenance maintenance = maintenanceService.modifyMaintenance(c);
        return maintenance;
    }
}
