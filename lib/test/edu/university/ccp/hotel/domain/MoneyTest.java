package edu.university.ccp.hotel.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    void constructor_shouldStoreAmount_whenValid() {
        // Arrange
        double amount = 100.0;

        // Act
        Money money = new Money(amount);

        // Assert
        assertEquals(100.0, money.getAmount());
    }

    @Test
    void constructor_shouldThrowException_whenNegative() {
        // Arrange
        double invalid = -1.0;

        // Act + Assert
        assertThrows(IllegalArgumentException.class, () -> new Money(invalid));
    }
}
