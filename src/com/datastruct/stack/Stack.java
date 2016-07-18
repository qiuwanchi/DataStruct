package com.datastruct.stack;

public class Stack {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 2;
		
		to(a, b);
		//
	}
	
	public static void to(int num,int i){
		java.util.Stack<Integer> number = new java.util.Stack<Integer>();
		
		int mod = 0;
		
		while(num != 0){
			mod = num % i;
			num /= i;
			number.push(mod);
		}
		
		StringBuffer sb = new StringBuffer();
		while(!number.isEmpty()){
			sb.append(number.pop());
		}
		System.out.println(sb);
		
	}
	
}
