package com.example;

import java.util.Scanner;

public class Main {
	public static void main( String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print ("Enter your name: ");
		String name = scanner.nextLine();
		
		Hello you = new Hello();
		System.out.println (you.username(name));
		scanner.close();
	}
}
