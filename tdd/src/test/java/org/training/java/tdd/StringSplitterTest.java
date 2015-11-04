package org.training.java.tdd;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class StringSplitterTest {

	private BasicStringSplitter stringSplitter;
	
	@Before
	public void createStringSplitter() {
		stringSplitter = new BasicStringSplitter();		
	}
	
	@Test
	public void shouldReturnEmptyArrayOnEmptyString() {
		int[] expected = new int[0];
		assertThat("empty string", stringSplitter.split(""), equalTo(expected));
	}

	@Test
	public void shouldReturnOneElementOnOneNumberInput() {
		int[] expected = { 1 };		
		assertThat("one number", stringSplitter.split("1"), equalTo(expected));
	}

	@Test
	public void shouldReturnArrayOnNumberInput() {
		int[] expected = { 1, 2 };		
		assertThat("two numbers", stringSplitter.split("1,2"), equalTo(expected));

		int[] expected2= { 1, 2, 3 };		
		assertThat("three numbers", stringSplitter.split("1,2,3"), equalTo(expected2));
	}
	

	@Test
	public void shouldReturnArrayOnNumberInputandSeparatorNewLine() {
		int[] expected = { 1, 2 ,3};		
		assertThat("three numbers with new line", 
					stringSplitter.split("1\n2,3"), equalTo(expected));

		int[] expected2 = { 1 };		
		assertThat("one number various delimiters", 
					stringSplitter.split("1\n,"), equalTo(expected2));
	}

	
	@Test(expected=Exception.class)
	public void shouldThrowAnExceptionOnWrongInput() {
		
		stringSplitter.split("1&&%2");

		fail("An exception should be thrown");
	}
	
}
