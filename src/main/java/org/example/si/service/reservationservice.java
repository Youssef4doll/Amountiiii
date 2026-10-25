package org.example.si.service;

import lombok.AllArgsConstructor;
import org.example.si.entity.reservation;
import org.example.si.repository.reservationrep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class reservationservice implements Ireservation {
    reservationrep reservationrep;

    public List<reservation> retrieveAllReservations() {
        return reservationrep.findAll();
    }

    public reservation retrieveReservation(Long reservationId) {
        return reservationrep.findById(reservationId).get();
    }

    public reservation addReservation(reservation reservation) {
        return reservationrep.save(reservation);
    }

    public void removeReservation(Long reservationId) {
        reservationrep.deleteById(reservationId);
    }

    public reservation modifyReservation(reservation reservation) {
        return reservationrep.save(reservation);
    }
}
