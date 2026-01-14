package edu.university.ccp.hotel.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HotelChain {

    private final List<Hotel> hotels;
    private final List<Reservation> reservations;

    public HotelChain() {
        this.hotels = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public void addHotel(Hotel hotel) {
        if (hotel == null) {
            throw new IllegalArgumentException("Hotel cannot be null");
        }
        hotels.add(hotel);
    }

    public List<Hotel> getHotels() {
        return new ArrayList<>(hotels);
    }

    public Reservation makeReservation(LocalDate reservationDate,
                                       LocalDate startDate,
                                       LocalDate endDate,
                                       int reservationNumber) {

        Reservation reservation = new Reservation(reservationDate, startDate, endDate, reservationNumber);
        reservations.add(reservation);
        return reservation;
    }

    public boolean cancelReservation(int reservationNumber) {
        for (int i = 0; i < reservations.size(); i++) {
            if (reservations.get(i).getNumber() == reservationNumber) {
                reservations.remove(i);
                return true;
            }
        }
        return false;
    }

    public void checkIn(Room room, Guest guest) {
        if (room == null) throw new IllegalArgumentException("Room cannot be null");
        if (guest == null) throw new IllegalArgumentException("Guest cannot be null");
        room.assignGuest(guest);
    }

    public void checkOut(Room room) {
    if (room == null) {
        throw new IllegalArgumentException("Room cannot be null");
    }
    room.clearGuest();
}

}
