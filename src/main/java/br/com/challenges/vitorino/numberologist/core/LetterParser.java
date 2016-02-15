package br.com.challenges.vitorino.numberologist.core;

import java.util.HashMap;
import java.util.Map;

public class LetterParser {

	private Map<String, Integer> letters = new HashMap<String, Integer>();
	
	public LetterParser() {
		loadLetters();
	}

	private void loadLetters() {
		String[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVXWYZ".split("");
		int i = 0;
		for(String letter : alphabet){
			i++;
			if (i > 9) {
				i = 1;
			}
			letters.put(letter, i);
		}
	}
	
	public int parse(String letter){
		return letters.get(letter);
	}
	
}
