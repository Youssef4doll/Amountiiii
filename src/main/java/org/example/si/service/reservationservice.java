package org.example.si.service;

import org.example.si.entity.reservation;
import org.example.si.repository.reservationrep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class reservationservice implements Ireservation {

    private final reservationrep reservationrep;

    public reservationservice(reservationrep clientrep) {
        this.reservationrep = clientrep;
    }
    public reservation addreservation(reservation m) {
        return reservationrep.save(m);
    }

    public List<reservation> getallreservation() {

        return reservationrep.findAll();
    }
    public reservation getreservationbyid (Long id) {
        return reservationrep.findById(id)
                .orElseThrow(() -> new RuntimeException("Client not found: " + id));
    }

    public void deletereservation(Long id) {
        reservationrep.deleteById(id);
    }
}
