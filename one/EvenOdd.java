package com.java.one;

import java.util.Random;

public class EvenOdd {
	public static void main(String[] args) {
		//random ÃßÃâ(500~1000)
		Random ran=new Random();
		int ranval=ran.nextInt(501);
		System.out.println("·£´ý°ª : "+ ranval);
		//Â¦È¦ ÆÇÁ¤
	if (ranval%2==0) {
		System.out.println("·£´ýÆÇÁ¤ : Â¦¼ö");
	}else {
		System.out.println("·£´ý ÆÇÁ¤ : È¦¼ö");
	}
	
	}
}
