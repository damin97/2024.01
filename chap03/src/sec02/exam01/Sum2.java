package sec02.exam01;

import java.util.Scanner;

public class Sum2 {
	
	public static void multi(int num1, int num2) {
		
		int result = num1 * num2;
		System.out.println("곱셈 결과:" + result);
		
	}
	
	public static void sum(int num1, int num2){ // 정적 메소드
		
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수:");
		String strNum1 = scanner.nextLine();
		System.out.print("두번째 수:");
		String strNum2 = scanner.nextLine();
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		sum(num1, num2);
		multi(num1, num2);
		

	}

}
