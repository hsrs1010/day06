package com.java.one;

import java.util.Random;

public class GradeTsest2 {

	public static void main(String[] args) {
		// 50��~100�� ���� ���� ���� ó�� ��

		Random r = new Random();
		char gradeA, gradeB;
		// �Է� �ޱ�
		int ranA = r.nextInt(51) + 50;
		int ranB = r.nextInt(51) + 50;

		// ���� ���
		System.out.println("ranA : " + ranA);
		System.out.println("ranB : " + ranB);

		// ��
		if (ranA >= 90) {
			gradeA='A';
		} else if (ranA >= 80) {
			gradeA='B';
		} else if (ranA >= 70) {
			gradeA='C';
		} else if (ranA >= 60) {
			gradeA='D';
		} else {
			gradeA='F';
		}
		System.out.println("ranA : " +gradeA);

		if (ranB >= 90) {
			gradeB='A';
		} else if (ranB >= 80) {
			gradeB='B';
		} else if (ranB >= 70) {
			gradeB='C';
		} else if (ranB >= 60) {
			gradeB='D';
		} else {
			gradeB='F';
		}
		System.out.println("ranB : " +gradeB);

	}

}
