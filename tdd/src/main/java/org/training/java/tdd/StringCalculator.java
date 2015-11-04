package org.training.java.tdd;



public class StringCalculator {
	
	private StringSplitter stringSplitter;
	

	public StringCalculator() {
		this.stringSplitter = new BasicStringSplitter();		
	}
	
	public StringCalculator(StringSplitter stringSplitter) {
		this.stringSplitter = stringSplitter;
	}


	public int add(String params) {
		int result = 0;

		int[] numbers = stringSplitter.split(params);
		
		for (int i=0; i < numbers.length; i++) {
			result += numbers[i];
		}
		
		return result;
	}
	
	public StringSplitter getStringSplitter() {
		return stringSplitter;
	}

	public void setStringSplitter(StringSplitter stringSplitter) {
		this.stringSplitter = stringSplitter;
	}

}
