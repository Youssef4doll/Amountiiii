package org.example.si.service;

import org.example.si.entities.Reservation;

import java.util.List;

public interface IReservationService {
    public List<Reservation> retrieveAllReservations();
    public Reservation retrieveReservation(Long reservationId);
    public Reservation addReservation(Reservation reservation);
    public void removeReservation(Long reservationId);
    public Reservation modifyReservation(Reservation reservation);
}
