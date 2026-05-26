package com.example;

import java.util.Scanner;
import java.text.Normalizer;
import java.util.regex.Pattern;

public class Main {
	public static void main( String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.printf ("Digit the word: ");
		String word = scanner.nextLine();
		
		VowelCounter vowelcounter = new VowelCounter();
		try {
	   		System.out.printf ("Vowels quantity: %d%n", vowelcounter.counter(word));
		} catch (IllegalArgumentException e) {
	   		System.out.println("Error: " + e.getMessage());
		}
		scanner.close();
	}
}
