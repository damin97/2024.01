package sec02.exam01;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
			int str1 = Integer.parseInt(scanner.nextLine());
			
			if(str1 == 1) {
				
				System.out.print("예금액>");
				balance += Integer.parseInt(scanner.nextLine());
				System.out.println();
				
			}else if(str1 == 2) {
				
				System.out.print("출금액>");
				balance -= Integer.parseInt(scanner.nextLine());
				System.out.println();
				
			}else if(str1 == 3) {
				
				System.out.print("잔고>");
				System.out.println(balance);
				System.out.println();
				
			}else {
				System.out.println();
				break;
			}
			
		}
		
		System.out.println("프로그램 종료");

	}

}
