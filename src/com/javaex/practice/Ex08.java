package com.javaex.practice;

/*배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요-미니로또
(중복체크 할 것)*/


public class Ex08 {

	public static void main(String[] args) {
		
		int lotto[] = new int[6];
				
		for(int i = 0; i < lotto.length; i++) {
			
			lotto[i] = (int)(Math.random() * 45) + 1;
			
			for(int x = 0; x < i; x++) {
				if(lotto[i] == lotto[x]) {
					i--;
				}
			}
			
		}
		
 		for(int i = 0; i <lotto.length; i++) {
			System.out.print(lotto[i] + "     ");
		}

	}
}
