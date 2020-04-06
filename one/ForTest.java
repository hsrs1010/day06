package com.java.one;

public class ForTest {
	public static void main(String[] args) {
		for (int i = 0; i <10; i=i+2) {
			System.out.println(i);
			
		}
		
	}
	/*실행순서 : 1 > 2 > 3 > 4 > 2 > 3 > 4 > 2 > 3 > 4 ...
	 * for (초기문 1 ; 조건식 2 ; 증감식 4 ) {
			문장 출력 3
			
		}
	 */
}
