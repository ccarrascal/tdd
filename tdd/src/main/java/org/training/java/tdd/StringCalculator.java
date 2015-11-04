package org.training.java.tdd;

import java.util.StringTokenizer;


public class StringCalculator {
	

	public int add(String params) {
		
		int result = 0;
		StringTokenizer st = new StringTokenizer(params, ",");
		while (st.hasMoreTokens()) {
			
			String aux = st.nextToken();
			result = result + Integer.parseInt(aux);
		}
		
		return result;
	}
}
