package com.javaex.practice;

//오류 수정 후 출력결과 예상

public class Ex01 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result[] = new int[5];
		
		for(int i = 0; i < intArray.length; i++) {
			result[i] = intArray[i];
			
			System.out.println(result[i]);
		}
		
		
	}

}
