package com.example;

import java.util.Scanner;

public class Main {
	public static void main( String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print ("Enter the temperature in Celsius: ");
		double temp = scanner.nextDouble();
		
		TempConverter converter = new TempConverter();
		System.out.printf ("%.2f%n", converter.CelsiusToFahrenheit(temp));
		scanner.close();
	}
}
