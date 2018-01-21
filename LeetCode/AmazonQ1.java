//Given a number print the number of combinations you can derive from the number. 1=A, 2=B, 26=Z, 0=+. 
//
//For example: 1123 can be represented by 1,1,2,3 which would stand for AABC. 
//Another representation - 11,23 - JW 
//Another representation - 1,1,23 - AAW 
//Another representation - 11,2,3 - JBC 
//
//For number 1123, there will be 5 combinations.

package com.example.Practice;

public class AmazonQ1 {

	
	static int numPermutations(int num)
	{
	  if (num < 10) {
	    return 1;
	  }
	  int lastTwo = num % 100;

	  if (lastTwo <= 26) {
	    return numPermutations(num / 100) + numPermutations(num / 10);
	  } else {
	    return numPermutations(num / 10);
	  }
	}
	
	public static void main(String[] args) {
		System.out.println(numPermutations(1123));
		
	}

}
