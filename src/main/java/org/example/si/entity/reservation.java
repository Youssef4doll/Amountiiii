package org.example.si.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import java.time.LocalDate;

@Entity
public class reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String statut;

    @ManyToOne
    @JoinColumn(name = "id_vehicule")
    private vehicule vehicule;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private client client;

    @OneToOne(mappedBy = "reservation")
    private contrat contrat;
}
