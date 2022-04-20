package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double[] average = new double[5];
		
		int num;
		double sum = 0;
		
		for(int i = 0; i < average.length; i++) {
			num = sc.nextInt();
			sum += num; 
		}System.out.println("평균은 " + sum / average.length + " 입니다.");
		
		
		
		
		
		
	}
}
