package com.example.Practice;

/**
 * Implement atoi to convert a string to an integer.
 */

public class PrintInt {

	private static int parseInt(String s){

		s = s.replaceAll("[a-zA-Z]", "");
		s = s.replaceAll(" ", "");
		
		if(s.length() < 1) {
			return -1;
		}
		int i =0;
		int result = 0;
		boolean isNegative = false;
		
		if(s.charAt(0) == '-'){
			i++;
			isNegative = true;
		}
		
		while(i < s.length()){
			result = result*10 +(s.charAt(i++) - '0');
		}
		
		if(isNegative)
			return -result;
		else
			return result;
	}
	
	public static void main(String[] args) {
		System.out.println(parseInt("-200a sdasds"));
	}

}
