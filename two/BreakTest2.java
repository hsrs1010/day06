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
				System.out.println("i�� : " +i);
				//Ư�� ��������, ����������
				if(i==5) {
					break;//�ݺ��� ��������
					
				}
			}
		}
	}
}
