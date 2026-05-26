package com.example;

public class HigherAndLower {
	public String higherorlower (int[] numbers) {
		if (numbers.length <= 0) throw new IllegalArgumentException("invalid size");
		int higher = numbers[0], lower = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (higher < numbers[i]) higher = numbers[i];
			if (lower > numbers[i]) lower = numbers[i];
		}
		return "Lower: " + lower + "\nHigher: " + higher;
	}
}
