package edu.university.ccp.hotel.domain;

public class ReserverPayer {

    private final Identity identity;
    private final CreditCard creditCard;

    public ReserverPayer(Identity identity, CreditCard creditCard) {
        if (identity == null) {
            throw new IllegalArgumentException("Identity cannot be null");
        }
        if (creditCard == null) {
            throw new IllegalArgumentException("Credit card cannot be null");
        }
        this.identity = identity;
        this.creditCard = creditCard;
    }

    public Identity getIdentity() {
        return identity;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }
}
