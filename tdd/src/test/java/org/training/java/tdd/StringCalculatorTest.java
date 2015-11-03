package org.training.java.tdd;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

	private StringCalculator stringCalculator;
	
	@Before
	public void createStringCalculator() {
		stringCalculator = new StringCalculator();
	}
	
	@Test
	public void shouldReturnCeroOnEmpty() {
		
		assertEquals("No input numbers", 0, stringCalculator.add(""));
	}
	
	@Test
	public void shouldReturnSameNumber() {
		
		assertEquals(1, stringCalculator.add("1"));
		assertEquals(0, stringCalculator.add("0"));
	}

	@Test
	public void shouldAddTwoNumbers() {
		
		assertEquals(0, stringCalculator.add("0,0"));
		assertEquals(2, stringCalculator.add("1,1"));
	}

	@Test
	public void shouldAddMoreThanTwoNumbers() {
		
		assertEquals(60, stringCalculator.add("10,20,30"));
		assertEquals(80, stringCalculator.add("10,20,30,5,15"));
	}
}
