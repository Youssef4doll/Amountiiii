package org.example.si.service;

import org.example.si.entity.contrat;
import org.example.si.repository.contratrep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class contratservice implements Icontrat {

    private final contratrep contratrep;

    public contratservice(contratrep contratrep) {
        this.contratrep = contratrep;
    }

    public contrat addContrat(contrat c) {
        return contratrep.save(c);
    }

    public List<contrat> getAllContrats() {
        return contratrep.findAll();
    }

    public contrat getContratById(Long id) {
        return contratrep.findById(id)
                .orElseThrow(() -> new RuntimeException("Contrat not found: " + id));
    }

    public void deleteContrat(Long id) {
        contratrep.deleteById(id);
    }
}