package edu.university.ccp.hotel.domain;

public class CreditCard {

    private final String number;

    public CreditCard(String number) {
        if (number == null || number.isEmpty()) {
            throw new IllegalArgumentException("Credit card number cannot be empty");
        }
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}
