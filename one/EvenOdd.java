package com.java.one;

import java.util.Random;

public class EvenOdd {
	public static void main(String[] args) {
		//random ����(500~1000)
		Random ran=new Random();
		int ranval=ran.nextInt(501);
		System.out.println("������ : "+ ranval);
		//¦Ȧ ����
	if (ranval%2==0) {
		System.out.println("�������� : ¦��");
	}else {
		System.out.println("���� ���� : Ȧ��");
	}
	
	}
}
