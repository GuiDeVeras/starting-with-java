package com.example;

public class Hello {
	public static String username (String name) {
		if (name == null || name.isEmpty()) {
			return "Hello, Guest!";
		}
		return "Hello, " + name + "!";
	}
}
