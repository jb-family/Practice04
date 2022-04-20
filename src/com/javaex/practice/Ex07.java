package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] wonArray = new int[10];
		
		wonArray[0] = 50000; 
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		System.out.print("금액 :");
		int num = sc.nextInt();
		int count;
		for (int i = 0; i < wonArray.length; i++) {
			count = num / wonArray[i];
			// 1 = 67879 / 50000 	i = 0
			// 1 = 17879 / 10000 	i = 1
			// 1 = 7879 / 5000 		i = 2
			// 2 = 2879 / 1000 		i = 3
			// 1 = 879 / 500 		i = 4
			// 3 = 379 / 100 		i = 5
			// 1 = 79 / 50 			i = 6
			// 2 = 29 / 10 			i = 7
			// 1 = 9 / 5 			i = 8
			// 4 = 4 / 1 			i = 9
			
			num = num % wonArray[i]; 	
			// 17879 = 67879 % 50000 	i = 0
			// 7879 = 17879 % 10000 	i = 1
			// 2879 = 7879 % 5000 		i = 2
			// 879 = 2879 % 1000 		i = 3
			// 379 = 879 % 500 			i = 4
			// 79 = 379 % 100 			i = 5
			// 29 = 79 % 50 			i = 6
			// 9 = 29 % 10 				i = 7
			// 4 = 9 % 5 				i = 8
			// 4 = 4 % 1 				i = 9
			
			System.out.println(wonArray[i] +"원 개수"+ count);
		}
		
		
		sc.close();
	}
}
