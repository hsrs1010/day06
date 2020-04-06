package com.java.one;

import java.util.Random;

public class GradeTsest {

	public static void main(String[] args) {
		// 50점~100점 사이 점수 랜덤 처리 평가

		Random r = new Random();
		// 입력 받기
		int ranA = r.nextInt(51) + 50;
		int ranB = r.nextInt(51) + 50;

		// 점수 출력
		System.out.println("ranA : " + ranA);
		System.out.println("ranB : " + ranB);

		// 평가
		if (ranA >= 90) {
			System.out.println("ranA : A");
		} else if (ranA >= 80) {
			System.out.println("ranA : B");
		} else if (ranA >= 70) {
			System.out.println("ranA : C");
		} else if (ranA >= 60) {
			System.out.println("ranA : D");
		} else {
			System.out.println("ranA : F");
		}

		if (ranB >= 90) {
			System.out.println("ranB : A");
		} else if (ranB >= 80) {
			System.out.println("ranB : B");
		} else if (ranB >= 70) {
			System.out.println("ranB : C");
		} else if (ranB >= 60) {
			System.out.println("ranB : D");
		} else {
			System.out.println("ranB : F");
		}

	}

}
