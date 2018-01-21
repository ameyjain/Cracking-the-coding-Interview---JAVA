package com.example.Practice;

import java.util.Arrays;

public class MajorityNumber {
	
	private static int majorityElement(int[] num) {
		if (num.length == 1) {
			return num[0];
		}
	 
		Arrays.sort(num);
		return num[num.length / 2];
	}


	public static void main(String[] args) {
		int [] a = {0,0,0,0,1,3,1,1};
		
		System.out.println(majorityElement(a));
	}

}
