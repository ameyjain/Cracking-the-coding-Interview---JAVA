package com.example.Practice;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * Median is the middle value in an ordered integer list.
 * If the size of the list is even, there is no middle value.
 * So the median is the mean of the two middle value.
 *
 * Examples:
 * [2,3,4] , the median is 3
 * [2,3], the median is (2 + 3) / 2 = 2.5
 *
 * Design a data structure that supports the following two operations:
 * void addNum(int num) - Add a integer number from the data stream to the data structure.
 * double findMedian() - Return the median of all elements so far.

 */

public class MedianOfDataStream {

	static PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());//lower half
	static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(); //higher half



	    // Adds a number into the data structure.
	    public static void addNum(int num) {
	        minHeap.offer(num);
	        maxHeap.offer(minHeap.poll());
	 
	        if(minHeap.size() < maxHeap.size()){
	            minHeap.offer(maxHeap.poll());
	        }
	        System.out.println("MAX "+maxHeap);
	        System.out.println("MIN "+minHeap);
	        System.out.println("");
	    }
	 
	    // Returns the median of current data stream
	    public static double findMedian() {
	        if(maxHeap.size()==minHeap.size()){
	            return (double)(maxHeap.peek()+(minHeap.peek()))/2;
	        }else{
	            return maxHeap.peek();
	        }
	    }
	
	public static void main(String[] args) {
		Random random = new Random();
		for(int i=0; i <10; i++){
			int rn = random.nextInt(99 + 1);
			System.out.println("Number: "+ rn);
			addNum(rn);
		}
		
		System.out.println(findMedian());
		
	}

}
