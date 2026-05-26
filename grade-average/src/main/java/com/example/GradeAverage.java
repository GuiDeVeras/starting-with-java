package com.example;

public class GradeAverage {
	public String Average (double a, double b, double c) {
		double result = (a + b + c) / 3;
		System.out.printf ("Average: %.2f%n", result);
		if (result >= 6) {
			return "Approved";
		}
		return "Repproved";
	}
}
