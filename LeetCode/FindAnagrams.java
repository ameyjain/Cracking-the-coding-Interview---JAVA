package com.example.Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindAnagrams {

	private static List<String> findAnagrams(String[] arg){

		Arrays.sort(arg, new Comparator<String>() {

			private String sortString(String s) {
                char[] charArray = s.toCharArray();
                Arrays.sort(charArray);
                return new String(charArray);
			}

			@Override
			public int compare(String s, String t1) {

                if (sortString(s).equals(t1)) {
                    return 0;
                }
                else if (sortString(s).length() > sortString(t1).length()) {
                    return 1;
                }
                else {
                    return -1;
                }
			}
		});

        return Arrays.asList(arg);
	}
	
	
	public static void main(String[] args) {
		String[] input = new String[] { "tea", "ate", "eat", "apple", "java", "vaja", "cut", "utc" };
		System.out.println(findAnagrams(input));
		
	}

}
