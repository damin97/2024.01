package chap05;

import java.util.Random;

public class LottoEx {

	public static void main(String[] args) {
		
		int[]lotto = new int[6];
		Random random = new Random();
		for(int i = 0; i<lotto.length; i++) {
			lotto[i]= random.nextInt(45)+1;
			System.out.println(lotto[i]);
		}
		System.out.println("---------------");
		
		for(int val: lotto) {
			System.out.println(val);
		}
			

	}

}
