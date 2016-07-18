package com.datastruct;

public class A {

	public static int search(String a,String b){
		
		char[] aChar = a.toCharArray();
		char[] bChar = b.toCharArray();
		
		for(int i = 0;i < aChar.length; i++){
			System.out.println("i=" + i);
			boolean flag = true;
			
			if(i + bChar.length > aChar.length){
				break;
			}
			for(int j = 0;j < bChar.length; j++){
				System.out.println("aChar[" + (i+j)+"]=" + aChar[i+j] + ";bChar[" + j + "]=" + bChar[j]);
				if(aChar[i+j] != bChar[j]){
					flag = false;
					break;
				}
			}
			
			if(flag){
				return i;
			}
			
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		String a = "abcabcabdabba";
		
		String b = "abcabd";
		
		System.out.println(A.search(a, b));
	}
}
