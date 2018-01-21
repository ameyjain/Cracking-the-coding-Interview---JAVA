package com.example.Practice;

public class Add2BinaryStrings {

	public static String addBinary(String a, String b){
		if((b == null || b.length() <1 ) && (a != null || a.length() > 1))
			return a;
		else if((b != null || b.length() >1 ) && (a == null || a.length() < 1))
			return b;
		else if ((b == null || b.length() <1 ) && (a == null || a.length() < 1))
			return null;
		
		StringBuffer result = new StringBuffer();
		int len1 = a.length();
		int len2 = b.length();
		int length = len1;
		int carry = 0;
		if(len1 > len2){
			for(int i = 0; i< len1-len2;i++){
				b = '0' + b;
			}
		}
		else{
			for(int i = 0; i< len2-len1;i++){
				a = '0' + a;
			}
			length = len2;
		}
		
		for(int i = length -1; i>=0; i--){
			int firstBit;
			int secondBit;
			if(a.charAt(i) == '0') firstBit = 0;
			else firstBit = 1;
			if(b.charAt(i) == '0') secondBit = 0;
			else secondBit = 1;

			int sum = (secondBit ^ firstBit ^ carry);
			result = result.insert(0, sum);
			carry = ((firstBit & carry) | (secondBit & carry) | (firstBit & secondBit));	

		}
		
		if(carry ==1)
			result = result.insert(0, 1);
			System.out.println(result.toString());
		return null;
	}
	
	
	public static void main(String[] args) {
		 String str1 = "1100011";
		 String str2 = "10";
		 addBinary(str1, str2);
	}

}
