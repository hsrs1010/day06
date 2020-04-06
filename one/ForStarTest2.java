package com.java.one;

public class ForStarTest2 {
	public static void main(String[] args) {
		// º°Âï±â
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j < 5 - i ? " " : "*");
			}
			System.out.println();
		}

		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j < 5 - i ? " " : "*");
			}
			System.out.println();

		}
	}
}