package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		
		int[] intA = new int[] {3, 6, 9};	
		
		int[] intB;		
		intB = intA;	// intA 3, 6, 9 intB 3, 6, 9	intB = intA; 같은주소를 가진다.
		intB[0] = 20;	// intA 20, 6, 9 intB 20, 6, 9
		intB[2] = 10;	// intA 20, 6, 10 intB 20, 6, 10
		
		for(int i = 0; i < intA.length; i++) {
			System.out.println(intA[i]);
		}
		// 예상 값
		// 20
		// 6
		// 10
		
		
		
	}
}
