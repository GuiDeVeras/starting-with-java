package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class HigherAndLowerTest {

    private final HigherAndLower higherandlower = new HigherAndLower();

    @Test
    void higherorlowerPositive() {
        String result = "Lower: 1\nHigher: 21";
	int[] a = {1, 2, 3, 5, 8, 13, 21};

        assertEquals(result, higherandlower.higherorlower(a));
    }

    @Test
    void higherorlowerNegative() {
        String result = "Lower: -143\nHigher: -1";
	int[] a = {-143, -6, -1, -24, -7, -10};

        assertEquals(result, higherandlower.higherorlower(a));
    }
    
    @Test
    void InvalidArraySize() {
        int[] a = new int[0];

        assertThrows(IllegalArgumentException.class, () -> {
        	higherandlower.higherorlower(a);
        });
    }

    @Test
    void higherorlowerZero() {
        String result = "Lower: 0\nHigher: 0";
	int[] a = {0, 0, 0, 0, 0, 0, 0};

        assertEquals(result, higherandlower.higherorlower(a));
    }
}
