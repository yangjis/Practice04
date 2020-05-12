package com.javaex.practice;

import java.util.Scanner;

//5개의 숫자를 키보드로 입력받아 편균을 구하는 프로그램

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];
		double result = 0;
		int sum = 0;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
			
			sum = sum + num[i];
			result = sum / num.length;
		}
		
		System.out.println("평균은 " + result + "입니다.");
		
		scan.close();
	}

}
