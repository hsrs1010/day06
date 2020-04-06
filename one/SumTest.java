package com.java.one;

public class SumTest {

	public static void main(String[] args) {
		// 합계 저장소 변수 만들기
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
			System.out.print(i+"\t");
			if (i%10==0) {
				System.out.println();//줄바꿈				
			}

		}
		// 최종값 출력
		System.out.println("sum : " + sum);

	}

}
