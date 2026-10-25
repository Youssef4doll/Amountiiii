package org.example.si.service;

import lombok.AllArgsConstructor;
import org.example.si.entities.Employe;
import org.example.si.repositories.EmployeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeServiceImpl implements IEmployeService {
    EmployeRepository employeRepository;

    public List<Employe> retrieveAllEmployes() {
        return employeRepository.findAll();
    }

    public Employe retrieveEmploye(Long employeId) {
        return employeRepository.findById(employeId).get();
    }

    public Employe addEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    public void removeEmploye(Long employeId) {
        employeRepository.deleteById(employeId);
    }

    public Employe modifyEmploye(Employe employe) {
        return employeRepository.save(employe);
    }
}
