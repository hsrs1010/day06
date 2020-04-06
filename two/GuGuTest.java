package com.java.two;

public class GuGuTest {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {//수평 출력
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i * j + '\t');
				 System.out.print('\t');
			}
			System.out.println();
		}
		System.out.println("=================================");
		//수직 출력
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + i * j+"\t");
//				 System.out.println('\t');
			}
			System.out.println();
	}
}
}