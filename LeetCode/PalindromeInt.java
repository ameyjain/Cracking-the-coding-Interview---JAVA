package com.example.Practice;

/**
 *
 * Determine whether an integer is a palindrome. Do this without extra space.
 *
 */

public class PalindromeInt {

	private static boolean isPalindrome(int num){

		int divider = 1;
		 while (num/divider > 10){
			 divider *= 10;
		 }
		
		 while (num > 1){
			 
			 if(num/divider != num%10){
				 return false;
			 }
			 num = (num%divider)/10;
			 divider /= 100;
		 }
		return true;
	}
	
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(32123));
	}

}
