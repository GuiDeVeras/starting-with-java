package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {

    private final EvenOrOdd decision = new EvenOrOdd();

    @Test
    void Even() {
        int a = 36;

        String result = decision.OddOrEven(a);

        assertEquals("Even", result);
    }

    @Test
    void Odd() {
        int a = 97;

        String result = decision.OddOrEven(a);

        assertEquals("Odd", result);
    }
}
