package com.example.Practice;

import java.util.Stack;

/**
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */

public class ValidParenthesis {

	private static boolean isValid(String s){
		
		Stack<Character> stack = new Stack<Character>();
		s = s.replaceAll("[A-Za-z0-9]", "");
		
		for(int i=0;i<s.length();i++){
			
			if(!stack.isEmpty()){
				if((stack.peek() == '{' && s.charAt(i) == '}') || (stack.peek() == '(' && s.charAt(i) == ')') || (stack.peek() == '[' && s.charAt(i) == ']')){
					stack.pop();
				}else{
					stack.push(s.charAt(i));
				}
			}else{
				stack.push(s.charAt(i));
			}
		}
		if(stack.isEmpty())
			return true;
		else
			return false;
	}
	
	
	public static void main(String[] args) {
		System.out.println(isValid("{[()]asdasdsad}()"));
		
	}

}
