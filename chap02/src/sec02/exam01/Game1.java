package sec02.exam01;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static int createNumber(Random rd) {
		//Random rd = new Random();
		return rd.nextInt(10) + 1;
	}

	public static void multiplication() {
		Random rd = new Random();
		Scanner scan = new Scanner(System.in);

		int num1 = createNumber(rd); // 1~10 랜덤 정수
		int num2 = rd.nextInt(10) + 1;
		int multi = num1 * num2;

		System.out.printf("%d X %d = ?\n", num1, num2);

		for (;;) {
			System.out.print("정답 입력>");
//			int input = scan.nextInt();
			int input = Integer.parseInt(scan.nextLine()); //같은 의미

			if(input == multi){
				System.out.println("정답입니다."); 
				break;
			} else {
				System.out.println("오답입니다.");
			}

		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			multiplication();
		}
		System.out.println("종료");
	}

}
