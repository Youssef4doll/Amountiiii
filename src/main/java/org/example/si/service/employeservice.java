package org.example.si.service;

import lombok.AllArgsConstructor;
import org.example.si.entity.employe;
import org.example.si.repository.employerep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class employeservice implements Iemploye {
    employerep employerep;

    public List<employe> retrieveAllEmployes() {
        return employerep.findAll();
    }

    public employe retrieveEmploye(Long employeId) {
        return employerep.findById(employeId).get();
    }

    public employe addEmploye(employe employe) {
        return employerep.save(employe);
    }

    public void removeEmploye(Long employeId) {
        employerep.deleteById(employeId);
    }

    public employe modifyEmploye(employe employe) {
        return employerep.save(employe);
    }
}
