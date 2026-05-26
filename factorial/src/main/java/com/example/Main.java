package com.example;

import java.util.Scanner;

public class Main {
	public static void main( String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print ("Enter a number: ");
		int a = scanner.nextInt();
		
		Factorial factorial = new Factorial();
		System.out.println (factorial.factorialnumber(a));
		scanner.close();
	}
}
