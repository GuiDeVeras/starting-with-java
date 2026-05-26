package com.example;

import java.util.Scanner;

public class Main {
	public static void main( String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.printf ("How many numbers do you want to compare?%n");
		int qtt = scanner.nextInt();
		int[] numbers = new int[qtt];
		for (int i = 0; i < qtt; i++) {
			System.out.printf ("Digit the number %d: ", i+1);
			int o = scanner.nextInt();
			numbers[i] = o;
		}
		
		HigherAndLower higherandlower = new HigherAndLower();
		System.out.println (higherandlower.higherorlower(numbers));
		scanner.close();
	}
}
