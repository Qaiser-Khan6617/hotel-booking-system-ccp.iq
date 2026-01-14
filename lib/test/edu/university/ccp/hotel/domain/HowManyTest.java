package edu.university.ccp.hotel.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HowManyTest {

    @Test
    void constructor_shouldStoreNumber_whenValid() {
        // Arrange
        int value = 5;

        // Act
        HowMany howMany = new HowMany(value);

        // Assert
        assertEquals(5, howMany.getNumber());
    }

    @Test
    void constructor_shouldThrowException_whenInvalid() {
        // Arrange
        int invalid = 0;

        // Act + Assert
        assertThrows(IllegalArgumentException.class, () -> new HowMany(invalid));
    }
}
