package com.proj;

import java.util.Scanner;

public class Project4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String name = "";
		String ssn = "";
		String tel = "";
		int balance = 0;
		boolean loginStatus = false;
		boolean membershipStatus = false;
		boolean run = true;
		boolean run2 = false;

		while (run) {
			System.out.println("----------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("메뉴 선택>");
			int num = Integer.parseInt(scanner.nextLine());

			switch (num) {

			case 1:
				if (!membershipStatus) { // 회원가입 안된 상태
					System.out.println("회원가입 하시기 바랍니다");
					break;
				}
				if (loginStatus) { // 로그인 된 상태
					System.out.println("로그인 상태 입니다");
					break;
				}
				// 회원가입 된 상태
				System.out.print("아이디: ");
				String id = scanner.nextLine();
				System.out.print("패스워드: ");
				String pw = scanner.nextLine();

				if (id.equals(name)) {
					if (pw.equals(ssn)) {
						System.out.println("로그인 성공");
						loginStatus = true;
						run2 = true;
					} else {
						System.out.println("패스워드가 틀렸습니다");
					}
				} else {
					System.out.println("아이디가 틀렸습니다");
				}
				break;

			case 2:
				if (membershipStatus) { // 회원가입 된 상태
					System.out.println("이미 회원가입 하셨습니다");
					break;
				}
				// 회원가입 하기
				System.out.println("[필수 정보 입력]");
				System.out.print("이름: ");
				name = scanner.nextLine();
				System.out.print("주민번호 앞 6자리: ");
				ssn = scanner.nextLine();
				System.out.print("전화번호: ");
				tel = scanner.nextLine();
				membershipStatus = true;
				break;

			case 3:
				if (!loginStatus) { // 로그인 안된 상태
					System.out.println("로그인 하시기 바랍니다");
					break;
				}
				// 로그인 된 상태
				while (run2) {
					System.out.println("-------------------------------------");
					System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
					System.out.println("-------------------------------------");
					System.out.print("메뉴 선택> ");
					int menu2 = Integer.parseInt(scanner.nextLine());

					switch (menu2) {
					case 1:
						System.out.print("예금액> ");
						balance += Integer.parseInt(scanner.nextLine());
						break;
					case 2:
						System.out.print("출금액> ");
						balance -= Integer.parseInt(scanner.nextLine());
						break;
					case 3:
						System.out.print("잔고> ");
						System.out.println(balance);
						break;
					case 4:
						run2 = false;
						break;
					}
				}
				break;
				
			case 4:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
	
}