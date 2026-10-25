package org.example.si.control;

import lombok.AllArgsConstructor;
import org.example.si.entities.Employe;
import org.example.si.service.IEmployeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/employe")
public class EmployeRestController {
    IEmployeService employeService;

    @GetMapping("/retrieve-all-employes")
    public List<Employe> getEmployes() {
        List<Employe> listEmployes = employeService.retrieveAllEmployes();
        return listEmployes;
    }

    @GetMapping("/retrieve-employe/{employe-id}")
    public Employe retrieveEmploye(@PathVariable("employe-id") Long employeId) {
        Employe employe = employeService.retrieveEmploye(employeId);
        return employe;
    }

    @PostMapping("/add-employe")
    public Employe addEmploye(@RequestBody Employe c) {
        Employe employe = employeService.addEmploye(c);
        return employe;
    }

    @DeleteMapping("/remove-employe/{employe-id}")
    public void removeEmploye(@PathVariable("employe-id") Long employeId) {
        employeService.removeEmploye(employeId);
    }

    @PutMapping("/modify-employe")
    public Employe modifyEmploye(@RequestBody Employe c) {
        Employe employe = employeService.modifyEmploye(c);
        return employe;
    }
}
