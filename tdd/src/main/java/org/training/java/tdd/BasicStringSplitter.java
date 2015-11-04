package org.training.java.tdd;

import java.util.StringTokenizer;


public class BasicStringSplitter implements StringSplitter {

	public int[] split(String numbers) {
		int[] result;
		int x = 0;
		
		numbers = numbers.replace("\n", ",");
		
		StringTokenizer st = new StringTokenizer(numbers, ",");
		result = new int[st.countTokens()];
		
		while (st.hasMoreTokens()) {
			
			result[x] = Integer.parseInt(st.nextToken());
			x++;			
			
		}

		
		return result;
	}
}
