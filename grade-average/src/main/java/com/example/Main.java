package com.example;

import java.util.Scanner;

public class Main {
	public static void main( String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print ("Enter three numbers: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		GradeAverage gradeaverage = new GradeAverage();
		System.out.println (gradeaverage.Average(a, b, c));
		scanner.close();
	}
}
