package org.example.si.controller;

import lombok.AllArgsConstructor;
import org.example.si.entity.employe;
import org.example.si.service.Iemploye;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/employe")
public class employecontroller {
    Iemploye employeService;

    @GetMapping("/retrieve-all-employes")
    public List<employe> getEmployes() {
        List<employe> listEmployes = employeService.retrieveAllEmployes();
        return listEmployes;
    }

    @GetMapping("/retrieve-employe/{employe-id}")
    public employe retrieveEmploye(@PathVariable("employe-id") Long employeId) {
        employe employe = employeService.retrieveEmploye(employeId);
        return employe;
    }

    @PostMapping("/add-employe")
    public employe addEmploye(@RequestBody employe c) {
        employe employe = employeService.addEmploye(c);
        return employe;
    }

    @DeleteMapping("/remove-employe/{employe-id}")
    public void removeEmploye(@PathVariable("employe-id") Long employeId) {
        employeService.removeEmploye(employeId);
    }

    @PutMapping("/modify-employe")
    public employe modifyEmploye(@RequestBody employe c) {
        employe employe = employeService.modifyEmploye(c);
        return employe;
    }
}
