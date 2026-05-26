package com.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class MultiplicationTableTest {

    private final MultiplicationTable multiplicationtable = new MultiplicationTable();

    @Test
    void TablePositive() {
        int a = 9;
	int[] result = {9, 18, 27, 36, 45, 54, 63, 72, 81, 90};

        int[] results = multiplicationtable.Table(a);

        assertArrayEquals(results, result);
    }

    @Test
    void TableNegative() {
        int a = 6;
	int[] result = {6, 12, 18, 24, 30, 36, 42, 48, 54, 60};

        int[] results = multiplicationtable.Table(a);

        assertArrayEquals(results, result);
    }

    @Test
    void TableZero() {
        int a = 0;
	int[] result = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	
        int[] results = multiplicationtable.Table(a);

        assertArrayEquals(results, result);
    }
}
