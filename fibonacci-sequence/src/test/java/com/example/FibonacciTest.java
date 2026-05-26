package com.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FibonacciTest {

    private final Fibonacci fibonacci = new Fibonacci();

    @Test
    void fibsequencePositive() {
        int a = 7;
	long[] result = {1, 2, 3, 5, 8, 13, 21};

        long[] results = fibonacci.fibsequence(a);

        assertArrayEquals(results, result);
    }

    @Test
    void fibsequenceNegative() {
        int a = -1;

        assertThrows(IllegalArgumentException.class, () -> {
        	fibonacci.fibsequence(a);
        });
    }

    @Test
    void fibsequenceZero() {
        int a = 0;
	long[] result = {};
	
        long[] results = fibonacci.fibsequence(a);

        assertArrayEquals(results, result);
    }
}
