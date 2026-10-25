package org.example.si.controller;

import lombok.AllArgsConstructor;
import org.example.si.entity.reservation;
import org.example.si.service.Ireservation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class reservationcontroller {
    Ireservation reservationService;

    @GetMapping("/retrieve-all-reservations")
    public List<reservation> getReservations() {
        List<reservation> listReservations = reservationService.retrieveAllReservations();
        return listReservations;
    }

    @GetMapping("/retrieve-reservation/{reservation-id}")
    public reservation retrieveReservation(@PathVariable("reservation-id") Long reservationId) {
        reservation reservation = reservationService.retrieveReservation(reservationId);
        return reservation;
    }

    @PostMapping("/add-reservation")
    public reservation addReservation(@RequestBody reservation c) {
        reservation reservation = reservationService.addReservation(c);
        return reservation;
    }

    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeReservation(@PathVariable("reservation-id") Long reservationId) {
        reservationService.removeReservation(reservationId);
    }

    @PutMapping("/modify-reservation")
    public reservation modifyReservation(@RequestBody reservation c) {
        reservation reservation = reservationService.modifyReservation(c);
        return reservation;
    }
}
