package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FactorialTest {

    private final Factorial factorial = new Factorial();

    @Test
    void FactorialNumberPositive() {
        int a = 9;

        int result = factorial.factorialnumber(a);

        assertEquals(362880, result);
    }

    @Test
    void FactorialNumberNegative() {
        int a = -6;

        int result = factorial.factorialnumber(a);

        assertEquals(1, result);
    }

    @Test
    void FactorialNumberZero() {
        int a = 0;

	int result = factorial.factorialnumber(a);
	
        assertEquals(0, result);
    }
}
