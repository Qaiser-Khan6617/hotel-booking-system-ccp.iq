package edu.university.ccp.hotel.domain;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private final Name name;
    private final List<Room> rooms;

    public Hotel(Name name) {
        if (name == null) {
            throw new IllegalArgumentException("Hotel name cannot be null");
        }
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public Name getName() {
        return name;
    }

    public void addRoom(Room room) {
        if (room == null) {
            throw new IllegalArgumentException("Room cannot be null");
        }
        rooms.add(room);
    }

    public List<Room> getRooms() {
        return new ArrayList<>(rooms);
    }

    public boolean isRoomAvailable(int roomNumber) {
        for (Room r : rooms) {
            if (r.getNumber() == roomNumber) {
                return !r.isOccupied();
            }
        }
        return false;
    }
}
