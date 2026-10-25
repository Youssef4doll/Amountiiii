package org.example.si.service;

import org.example.si.entity.employe;
import org.example.si.repository.employerep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class employeservice implements Iemploye {

    private final employerep employerep;

    public employeservice(employerep employerep) {
        this.employerep = employerep;
    }

    public employe addEmploye(employe e) {
        return employerep.save(e);
    }

    public List<employe> getAllEmployes() {
        return employerep.findAll();
    }

    public employe getEmployeById(Long id) {
        return employerep.findById(id)
                .orElseThrow(() -> new RuntimeException("Employe not found: " + id));
    }

    public void deleteEmploye(Long id) {
        employerep.deleteById(id);
    }
}