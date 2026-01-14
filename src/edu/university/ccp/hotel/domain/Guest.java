package edu.university.ccp.hotel.domain;

public class Guest {

    private final Name name;
    private final Address address;

    public Guest(Name name, Address address) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        if (address == null) {
            throw new IllegalArgumentException("Address cannot be null");
        }
        this.name = name;
        this.address = address;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}

