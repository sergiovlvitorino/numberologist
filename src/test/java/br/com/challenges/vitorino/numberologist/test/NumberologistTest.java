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
	
	public void testIfAAIStringReturnsEleven(){
		int expected = 11;
		int actual = numberologist.execute("AAI");
		assertEquals(expected, actual);
	}
	
	public void testIfAAIAAIStringReturnsTwentyTwo(){
		int expected = 22;
		int actual = numberologist.execute("AAIAAI");
		assertEquals(expected, actual);
	}
	
	public void testIfAAIAAIAAIStringReturnsThirtyThree(){
		int expected = 33;
		int actual = numberologist.execute("AAIAAIAAI");
		assertEquals(expected, actual);
	}
	
	public void testIfElevenStringReturnsEleven(){
		int expected = 11;
		int actual = numberologist.execute("11");
		assertEquals(expected, actual);
	}
	
	public void testIfTwentyTwoStringReturnsTwentyTwo(){
		int expected = 22;
		int actual = numberologist.execute("22");
		assertEquals(expected, actual);
	}
	
	public void testIfThirtyThreeStringReturnsThirtyThree(){
		int expected = 33;
		int actual = numberologist.execute("33");
		assertEquals(expected, actual);
	}

}
