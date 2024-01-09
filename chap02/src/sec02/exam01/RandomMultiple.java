package sec02.exam01;

import java.util.Random;
import java.util.Scanner;

public class RandomMultiple {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int num1 = rd.nextInt(10)+1; // 1~10까지 랜덤으로 난수 발생
		int num2 = rd.nextInt(99)+1; // 1~100까지 랜덤으로 난수 발생
		
		System.out.print(num1); 
		System.out.print("x");
		System.out.print(num2); 
		System.out.println("=?");
		System.out.print("정답 입력>");
		
		for(;;) {
			Scanner scan = new Scanner(System.in);
			
			int input = scan.nextInt();
			// int input = Integer.parseInt(scan.nextLine()); 위 문장과 같은 의미
			int right_input = num1*num2;
			
			if(input == right_input) {
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println("틀렸습니다.");
				System.out.print("정답 입력>");
			}
		}
	
	}

}
