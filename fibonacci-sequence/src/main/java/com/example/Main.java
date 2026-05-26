package com.example;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main( String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.print ("Enter a number: ");
		int a = scanner.nextInt();
		long[] results;
		
		Fibonacci fibonacci = new Fibonacci();
		try {
	   		results = fibonacci.fibsequence(a);
	  		System.out.printf("0%n1%n");
	  		for (int i = 0; i < a; i++) {
				System.out.printf("%d%n", results[i]);
	    		}
		} catch (IllegalArgumentException e) {
	   		System.out.println("Error: " + e.getMessage());
		}
		scanner.close();
	}
}
