package br.com.challenges.vitorino.numberologist;

import java.util.Calendar;

import br.com.challenges.vitorino.numberologist.core.Core;

public class Numberologist {
	
	private Core core;
	
	public Numberologist() {
		this.core = new Core();
	}
	
	public int execute(String name){
		return core.execute(name);
	}
	
	public int execute(Calendar date){
		return core.execute(date);
	}

}
