package br.com.challenges.vitorino.numberologist.test;

import java.util.Calendar;

import br.com.challenges.vitorino.numberologist.Numberologist;
import junit.framework.TestCase;

public class NumberologistTest extends TestCase {
	
	private Numberologist numberologist;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		numberologist = new Numberologist();
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		numberologist = null;
	}
	
	public void testIfBrasilStringReturnsIntSeven(){
		int expected = 7;
		int actual = numberologist.execute("BRASIL");
		assertEquals(expected, actual);
	}
	public void testIfBirthdayReturnsIntFour(){
		int expected = 4;
		Calendar birthday = Calendar.getInstance();
		birthday.set(Calendar.DAY_OF_MONTH, 22);
		birthday.set(Calendar.MONTH, 3);
		birthday.set(Calendar.YEAR, 1500);
		int actual = numberologist.execute(birthday);
		assertEquals(expected, actual);
	}
	
	public void testIfUSAStringReturnFive(){
		int expected = 5;
		int actual = numberologist.execute("USA");
		assertEquals(expected, actual);
	}

}
