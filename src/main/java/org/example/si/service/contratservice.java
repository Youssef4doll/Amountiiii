package org.example.si.service;

import lombok.AllArgsConstructor;
import org.example.si.entity.contrat;
import org.example.si.repository.contratrep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class contratservice implements Icontrat {
    contratrep contratrep;

    public List<contrat> retrieveAllContrats() {
        return contratrep.findAll();
    }

    public contrat retrieveContrat(Long contratId) {
        return contratrep.findById(contratId).get();
    }

    public contrat addContrat(contrat contrat) {
        return contratrep.save(contrat);
    }

    public void removeContrat(Long contratId) {
        contratrep.deleteById(contratId);
    }

    public contrat modifyContrat(contrat contrat) {
        return contratrep.save(contrat);
    }
}
