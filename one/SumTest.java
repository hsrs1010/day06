package com.java.one;

public class SumTest {

	public static void main(String[] args) {
		// �հ� ����� ���� �����
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
			System.out.print(i+"\t");
			if (i%10==0) {
				System.out.println();//�ٹٲ�				
			}

		}
		// ������ ���
		System.out.println("sum : " + sum);

	}

}
