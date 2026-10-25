package org.example.si.service;

import org.example.si.entity.employe;

import java.util.List;

public interface Iemploye {
    public List<employe> retrieveAllEmployes();
    public employe retrieveEmploye(Long employeId);
    public employe addEmploye(employe employe);
    public void removeEmploye(Long employeId);
    public employe modifyEmploye(employe employe);
}
