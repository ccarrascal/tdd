package org.training.java.tdd;

import java.util.StringTokenizer;


public class BasicStringSplitter implements StringSplitter {

	public int[] split(String input) {
		int[] result;
		int x = 0;
		
		StringBuilder inputBuilder = new StringBuilder(input);		
		String delimiter = getDelimiter(inputBuilder);				
		input = inputBuilder.toString().replace("\n", delimiter);
		
		StringTokenizer st = new StringTokenizer(input, delimiter);
		result = new int[st.countTokens()];
		
		while (st.hasMoreTokens()) {
			result[x] = Integer.parseInt(st.nextToken());
			x++;			
		}
		
		return result;
	}
	
	private String getDelimiter(StringBuilder inputString) {
		String delimiter = new String(",");
		
		if ( inputString.toString().startsWith("//") ) {
			int headerEnd = inputString.indexOf("\n");
			delimiter = inputString.substring(2, headerEnd);
			
			inputString.delete(0, headerEnd + 1); 
		}

		return delimiter;
	}
}
