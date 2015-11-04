package org.training.java.tdd;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

	private StringCalculator stringCalculatorSUT;
	private StringSplitter mockSplitter;
	
	
	@Before
	public void createStringCalculator() {
		mockSplitter = mock(StringSplitter.class);
		stringCalculatorSUT = new StringCalculator(mockSplitter);
	}
	
	@Test
	public void shouldReturnCeroOnEmpty() {
		
		when(mockSplitter.split(anyString())).thenReturn(new int[0]);
		assertThat("No input numbers", stringCalculatorSUT.add(""), equalTo(0));
		
	}
	
	@Test
	public void shouldReturnSameNumber() {
		int[] expected = { 1 };	
		String input = "1";
		
		when(mockSplitter.split(input)).thenReturn(expected);
		assertThat("Same number 1", stringCalculatorSUT.add(input), equalTo(1));

	}

	@Test
	public void shouldAddTwoNumbers() {
		int[] expected = { 1,2 };	
		String input = "1,2";

		when(mockSplitter.split(input)).thenReturn(expected);
		assertThat("Adds numbers 1+2", stringCalculatorSUT.add(input), equalTo(3));
	}

	@Test
	public void shouldAddTwoNumbersWithNewLineDelimiter() {
		int[] expected = { 1,2 };	
		String input = "1\n2";

		when(mockSplitter.split(input)).thenReturn(expected);
		assertThat("Adds numbers 1+2", stringCalculatorSUT.add(input), equalTo(3));
	}	
	
	@Test
	public void shouldAddTwoNumbersWithCustomDelimiter() {
		int[] expected = { 1,2 };	
		String input = "//;\n1;2";

		when(mockSplitter.split(input)).thenReturn(expected);
		assertThat("Adds numbers 1+2", stringCalculatorSUT.add(input), equalTo(3));
	}	

	
	@Test
	public void shouldAddMoreThanTwoNumbers() {
		int[] expected = { 1,2,3 };	
		String input = "1,2,3";

		when(mockSplitter.split(input)).thenReturn(expected);
		assertThat("Adds numbers 1+2+3", stringCalculatorSUT.add(input), equalTo(6));
	}
	

	
}
