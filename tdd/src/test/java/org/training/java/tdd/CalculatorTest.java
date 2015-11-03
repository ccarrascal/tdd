package org.training.java.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;
	
	@Before
	public void createCalculator() {
		calculator = new Calculator();
	}
	
	@Test
	public void shouldAddTwoIntegerNumbers() {
		// Given: two numbers
		int a = 3;
		int b = 2;
		
		// When: add method invoked
		int result = calculator.add(a,b);
				
		// Then: Check return value
		assertEquals(5, result);
		
	}
	
	// This method name is recommended for BDD (Behaviour Driven Desing)
	@Test
	public void givenTwoIntegersWhenSubstractedThenReturnRest() {
		assertEquals(2, calculator.substract(5, 3));		
	}
	
	@Test
	public void shouldSubstractTwoIntegerNumbers() {
		
		assertEquals(0, calculator.substract(0, 0));
		assertEquals(0, calculator.substract(5, 5));
		assertEquals(2, calculator.substract(5, 3));
		
	}
}
