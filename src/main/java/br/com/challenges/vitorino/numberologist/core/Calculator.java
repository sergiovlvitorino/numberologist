package br.com.challenges.vitorino.numberologist.core;

public class Calculator {

	private LetterParser letterParser;
	
	public Calculator() {
		this.letterParser = new LetterParser();
	}
	
	public int calculate(String text){
		String[] values = text.split("");
		int number = 0;
		for(String value : values){
			try {
				number += Integer.parseInt(value);
			} catch (NumberFormatException e) {
				number += letterParser.parse(value);
			}
		}
		if (number > 11 && number != 22 && number != 33) {
			return calculate(String.valueOf(number));
		}
		return number;
	}
	
}
