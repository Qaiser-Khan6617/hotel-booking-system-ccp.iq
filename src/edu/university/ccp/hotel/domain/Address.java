package edu.university.ccp.hotel.domain;

public class Address {

    private final String details;

    public Address(String details) {
        if (details == null || details.isEmpty()) {
            throw new IllegalArgumentException("Address cannot be empty");
        }
        this.details = details;
    }

    public String getDetails() {
        return details;
    }
}
