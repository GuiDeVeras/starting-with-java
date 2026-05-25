package com.example;

import java.util.Scanner;

public class Main {
	public static void main( String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print ("Enter the number: ");
		int number = scanner.nextInt();
		
		EvenOrOdd decision = new EvenOrOdd();
		System.out.println (decision.OddOrEven(number));
		scanner.close();
	}
}
