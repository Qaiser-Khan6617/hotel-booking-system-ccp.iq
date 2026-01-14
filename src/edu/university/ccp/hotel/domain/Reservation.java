package edu.university.ccp.hotel.domain;

import java.time.LocalDate;

public class Reservation {

    private final LocalDate reservationDate;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final int number;

    public Reservation(LocalDate reservationDate, LocalDate startDate, LocalDate endDate, int number) {
        if (reservationDate == null || startDate == null || endDate == null) {
            throw new IllegalArgumentException("Dates cannot be null");
        }
        if (number <= 0) {
            throw new IllegalArgumentException("Reservation number must be positive");
        }
        this.reservationDate = reservationDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.number = number;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public int getNumber() {
        return number;
    }
}
