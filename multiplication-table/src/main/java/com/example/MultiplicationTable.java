package com.example;

public class MultiplicationTable {
	public int[] Table (int a) {
		int[] results = new int[10];
		for (int i = 0; i < 10; i++) {
			results[i] = a * (i + 1);
		}
		return results;
	}
}
