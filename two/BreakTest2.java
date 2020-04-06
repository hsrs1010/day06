package com.java.two;

public class BreakTest2 {
	public static void main(String[] args) {
		//break
		for (int n = 0; n < 5; n++) {
			System.out.println(n);
			if (n==3) {
				break;
			}
			for (int i = 0; i <10; i++) {
				System.out.println("i값 : " +i);
				//특정 시점에서, 빠져나오기
				if(i==5) {
					break;//반복문 빠져나옴
					
				}
			}
		}
	}
}
