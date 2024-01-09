package sec03.exam01;

import java.util.Scanner;

public class Sum3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //입력을 위한 준비
		
		int sum =0;
		System.out.print("숫자 입력>"); //처리 (UI)
		int start = scan.nextInt(); //입력
		System.out.print("숫자 입력>"); //처리 (UI)
		int end = scan.nextInt(); //입력
		System.out.printf("num1: %d, num2: %d\n", start, end);
		for (int i=start; i<=end; i++) { //반복
			sum +=i; //계산 (누적처리)
		}
		System.out.println(sum); //출력

	}

}
