package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TempConverterTest {

    private final TempConverter converter = new TempConverter();

    @Test
    void TempConverterPositive() {
        double a = 37;

        double result = converter.CelsiusToFahrenheit(a);

        assertEquals(98.60 , result, 0.001);
    }

    @Test
    void TempConverterNegative() {
        double a = -20;

        double result = converter.CelsiusToFahrenheit(a);

        assertEquals(-4.00, result, 0.001);
    }

    @Test
    void TempConverterZero() {

        double a = 0;

        double result = converter.CelsiusToFahrenheit(a);

        assertEquals(32.00, result, 0.001);
    }
}
