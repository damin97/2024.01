package sec02.exam01;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수 입력>");
		int score = Integer.parseInt(scanner.nextLine());
		int num = score / 10; // 나눈 몫의 값
		
		switch(num) {
		
		case 10: 
			
		case 9:
			System.out.println("A등급 입니다");
			break;
		
		case 8:
			System.out.println("B등급 입니다");
			break;
			
		case 7:
			System.out.println("C등급 입니다");
			break;
			
		default:
			System.out.println("D등급 입니다");
			break;
		}

	}

}
