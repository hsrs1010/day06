package com.java.two;

public class ContinueTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i==5) {
//				System.out.println("i는 : 5에서 continue ");
				continue;
			}
			System.out.println("i는 : " +i);
		}
}
}
