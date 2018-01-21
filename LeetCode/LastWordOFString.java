package com.example.Practice;

public class LastWordOFString {

	private static String lastWord(String s) {
		if(s == null || s.length() < 1)
			return null;
		
		String[] arr = s.split(" ");
		return arr[arr.length-1];
	}
	
	public static void main(String[] args) {

		System.out.println(lastWord("hello world how are you"));
	}

}
