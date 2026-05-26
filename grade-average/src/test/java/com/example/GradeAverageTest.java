package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GradeAverageTest {

    private final GradeAverage gradeaverage = new GradeAverage();

    @Test
    void AverageApproved() {
        double a = 9;
        double b = 8;
	double c = 5;

        String result = gradeaverage.Average(a, b, c);

        assertEquals("Approved", result);
    }

    @Test
    void AverageRepproved() {
        double a = 6;
        double b = 3;
        double c = 5;

        String result = gradeaverage.Average(a, b, c);

        assertEquals("Repproved", result);
    }

    @Test
    void AverageZero() {

        double a = 0;
        double b = 0;
        double c = 0;

        String result = gradeaverage.Average(a, b, c);

        assertEquals("Repproved", result);
    }
}
