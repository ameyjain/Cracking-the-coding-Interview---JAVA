package com.example.Practice;

/**
 *
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Note: Given n will be a positive integer.
 */

public class ClimbStairs {

	private static int fib(int n)
	{
	   if (n <= 1)
	      return n;
	   return fib(n-1) + fib(n-2);
	}
	 
	// Returns number of ways to reach s'th stair
	private static int countWays(int s)
	{
	    return fib(s + 1);
	}
	
	
	public static void main(String[] args) {
		System.out.println(countWays(10));
	}

}
