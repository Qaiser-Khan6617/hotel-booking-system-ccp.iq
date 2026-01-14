package edu.university.ccp.hotel.domain;

public class Room {

    private final int number;
    private Guest guest;

    public Room(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Room number must be positive");
        }
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void assignGuest(Guest guest) {
        if (guest == null) {
            throw new IllegalArgumentException("Guest cannot be null");
        }
        this.guest = guest;
    }

    public void clearGuest() {
        this.guest = null;
    }

    public Guest getGuest() {
        return guest;
    }

    public boolean isOccupied() {
        return guest != null;
    }
}
