package br.com.challenges.vitorino.numberologist.core;

import java.util.Calendar;

public class Core {

	private Calculator calculator;
	
	public Core() {
		this.calculator = new Calculator();
	}
	
	public int execute(Calendar date) {
		StringBuilder text = new StringBuilder();
		text.append(date.get(Calendar.DAY_OF_MONTH));
		text.append(date.get(Calendar.MONTH));
		text.append(date.get(Calendar.YEAR));
		return calculator.calculate(text.toString());
	}
	
	public int execute(String name){
		name = name.replaceAll(" ", "");
		return calculator.calculate(name);
	}

}
