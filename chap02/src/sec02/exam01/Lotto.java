package sec02.exam01;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		
//		System.out.println(Math.PI);
		// 난수 발생 10번
		for(int i =0; i<10; i++) {
			int num = (int) (Math.random()*45 + 1); // 강제 형변환
			System.out.println(num); //난수 발생
		}
		
		System.out.println("----------");
		// 난수 발생 6번
		Random rd = new Random();
		for(int i=0; i<6; i++) {
			// System.out.println(rd.nextInt(10)); // 0~9
			// System.out.println(rd.nextInt(10)+1); // 1~10
			System.out.println(rd.nextInt(45)+1); // 1~45
		}

	}

}
