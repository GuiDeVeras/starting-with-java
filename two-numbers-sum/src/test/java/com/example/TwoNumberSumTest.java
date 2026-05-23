package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoNumberSumTest {

    private final TwoNumberSum twonumbersum = new TwoNumberSum();

    @Test
    void SumTwoPositives() {
        int a = 2;
        int b = 3;

        int result = twonumbersum.sum(a, b);

        assertEquals(5, result);
    }

    @Test
    void SumOneNegative() {
        int a = 2;
        int b = -3;

        int result = twonumbersum.sum(a, b);

        assertEquals(-1, result);
    }

    @Test
    void SumTwoNegatives() {
        int a = -2;
        int b = -3;

        int result = twonumbersum.sum(a, b);

        assertEquals(-5, result);
    }

    @Test
    void SumOneZero() {

        int a = 7;
        int b = 0;

        int result = twonumbersum.sum(a, b);

        assertEquals(7, result);
    }
}
