package com.example;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main( String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print ("Enter a number: ");
		int a = scanner.nextInt();
		int[] results;
		
		MultiplicationTable multiplicationtable = new MultiplicationTable();
		results = multiplicationtable.Table(a);
		for (int i = 0; i < 10; i++) {
			System.out.printf ("%d * %d = %d%n", a, i+1, results[i]);
		}
		scanner.close();
	}
}
