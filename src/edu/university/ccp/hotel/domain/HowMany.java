package edu.university.ccp.hotel.domain;

public class HowMany {
    private final int number;

    public HowMany(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("number must be > 0");
        }
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

