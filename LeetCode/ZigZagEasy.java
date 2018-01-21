package com.example.Practice;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this Pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I  G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 *
 */


public class ZigZagEasy {

	private static String convert(String s, int nRow){
		int len = s.length();
		StringBuffer[] arr = new StringBuffer[nRow];
		StringBuilder result = new StringBuilder();
		int i = 0;
		
		for(int j =0; j< nRow; j++){
			arr[j] = new StringBuffer();
		}		
		while(i < len){
			for(int index = 0; index < nRow && i < len; index ++) {
				arr[index].append(s.charAt(i++)); 
			}
			for(int index = nRow - 2; index >0 && i < len; index --) {
				arr[index].append(s.charAt(i++));
			}
		}
	
		for(StringBuffer sb : arr){
			result.append(sb.toString());
		}
		return result.toString();
	}
	
	
	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING", 3));
	}

}
