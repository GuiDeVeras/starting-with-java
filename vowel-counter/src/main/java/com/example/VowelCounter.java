package com.example;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class VowelCounter {
	public int counter (String word) {
		if (word == null || word.isEmpty()) throw new IllegalArgumentException("invalid word");
		int cont = 0;
		word = Normalizer.normalize(word, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        	word = pattern.matcher(word).replaceAll("");
        	word = word.toLowerCase();
		for (char c : word.toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				cont++;
			}
		}
		return cont;
	}
}
