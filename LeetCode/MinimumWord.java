//Find the minimum (index) distance sum of 3 words. 
//For example: arr = {"2", "1", "0", "2", "0", "3", "0"}, input = "1","2","3". 
//The result should be 8 since the 2nd "2" and "1", "3"'s distance are 3, 1, 5 
//and abs(3,1)+abs(3,5)+abs(5,1)=8. 
//Implement this in O(N)

package com.example.com.example;

public class MinimumWord {

	public static int findMinimum(int []arr, int a, int b,int c){
		int index_a = -1;
		int index_b = -1;
		int index_c = -1;
		int i = 0;
		int minimum = 11110;
		for (int item : arr){
			
			if(item == a) index_a = i;
			else if(item == b) index_b = i;
			else if(item == c) index_c = i;
			
			if(index_a > -1 && index_b > -1 && index_c > -1) 
				minimum = Math.min(minimum, Math.abs(index_a-index_b)+ Math.abs(index_a-index_c)+ Math.abs(index_c-index_b));
			i++;
		}
		
		return minimum;
	}
	
	public static void main(String[] args) {
		int [] a = {2, 1, 0, 2, 0, 3, 0};
		System.out.println(findMinimum(a,1,2,3));
		
	}

}
