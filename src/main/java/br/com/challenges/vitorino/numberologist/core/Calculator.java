package br.com.challenges.vitorino.numberologist.core;

public class Calculator {

	private LetterParser letterParser;
	public static final String ELEVEN = "11";
	public static final String TWENTY_TWO = "22";
	public static final String THIRTY_THREE = "33";
	
	public Calculator() {
		this.letterParser = new LetterParser();
	}
	
	public int calculate(String text){
		if (text.equals(ELEVEN) || text.equals(TWENTY_TWO) || text.equals(THIRTY_THREE)) {
			return Integer.parseInt(text);
		}
		String[] values = text.split("");
		int number = 0;
		for(String value : values){
			try {
				number += Integer.parseInt(value);
			} catch (NumberFormatException e) {
				number += letterParser.parse(value);
			}
		}
		if (number > Integer.parseInt(ELEVEN) && number != Integer.parseInt(TWENTY_TWO) && number != Integer.parseInt(THIRTY_THREE)) {
			return calculate(String.valueOf(number));
		}
		return number;
	}
	
}
