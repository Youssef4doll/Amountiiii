package org.example.si.service;

import org.example.si.entity.reservation;

import java.util.List;

public interface Ireservation {
    public List<reservation> retrieveAllReservations();
    public reservation retrieveReservation(Long reservationId);
    public reservation addReservation(reservation reservation);
    public void removeReservation(Long reservationId);
    public reservation modifyReservation(reservation reservation);
}
