package com.example;

public class Fibonacci {
	public long[] fibsequence (int a) {
		if (a < 0) throw new IllegalArgumentException("invalid number");
		long first = 0, second = 1;
		long[] results = new long[a];
		for (int i = 0; i < a; i++) {
			long next = first + second;
			results[i] = next;
			first = second;
			second = next;
		}
		return results;
	}
}
