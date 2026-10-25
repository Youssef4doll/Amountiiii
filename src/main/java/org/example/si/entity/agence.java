package org.example.si.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idagence;

    private String nom;
    private String ville;
    private String adresse;
    private String telephone;

    @OneToMany(mappedBy = "agence")
    private List<employe> employes;

    @OneToMany(mappedBy = "agence")
    private List<vehicule> vehicules;
}
