package edu.university.ccp.hotel.domain;

public class Identity {

    private final String value;

    public Identity(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Identity cannot be empty");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
