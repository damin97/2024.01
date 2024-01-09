package sec02.exam01;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("점수 입력>");
		int score = Integer.parseInt(scanner.nextLine());
		
		if (score <=100 && score >0) {
			if (score >= 90) {
				System.out.println("점수가 90~100점 입니다");
				System.out.println("A등급 입니다");
			} else if (score >= 80) {
				System.out.println("점수가 80~89점 입니다");
				System.out.println("B등급 입니다");
			} else if (score >= 70) {
				System.out.println("점수가 70~79점 입니다");
				System.out.println("C등급 입니다");
			} else {
				System.out.println("점수가 70점 미만입니다");
				System.out.println("D등급 입니다");
			}
		}else {
			System.out.println("점수 오류 입니다");
		}
		

	}

}
