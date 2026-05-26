package com.example;

public class Factorial {
	public int factorialnumber (int a) {
		if (a == 0) return a;
		int result = 1;
		for (int i = a; i >= 1; i--) result *= i;
		return result;
	}
}
