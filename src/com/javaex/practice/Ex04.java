package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};	
		// 축약어 int[] data = new int[13];  
		// data[0] ~ data[12] 까지 넣은 것과 같음

		int sum = 0;
		int count = 0;
		
		for(int i = 0; i < data.length; i++) {
			
			if(data[i] % 3 == 0) {
				sum += data[i];
				if(data[i] % 3 == 0) {
					count++;
				}
			}
		}	System.out.println("주어진 배열에서 3의 배수의 개수 =>" + count);
			System.out.println("주어진 배열에서 3의 배수의 합 => " + sum);
		 

		
	}
}





















