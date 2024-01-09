package com.proj;

import java.util.Scanner;

public class SmallProject2 {
	
	public static void login(boolean loginStatus, Scanner scanner, String memberName,String memberSSN) {
//		if (loginStatus) { // 로그인 여부 확인
//			System.out.println("이미 로그인 상태입니다");
//			continue; // 밑으로 안내려가고 switch를 빠져나간다
//		}
		
		System.out.println("-----로그인하기-----");
		System.out.print("아이디: ");
		String id1 = scanner.nextLine();
		System.out.print("패스워드: ");
		String num2 = scanner.nextLine();
//		int num2 = Integer.parseInt(scanner.nextLine());
		
		if(id1.equals(memberName)) {
			if(num2.equals(memberSSN)) {
				loginStatus = true;
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패: 패스워드가 틀렸습니다");
			}
			
		}else {
			System.out.println("로그인 실패: 아이디가 틀렸습니다");
		}
	}

	public static void main(String[] args) {
		
		String memberName = "admin"; // 지역 변수, 회원이름
		String memberSSN = "111111"; // 지역 변수, 회원 생년월일 (패스워드로 사용)
		String memberTel = "01012341234"; // 지역 변수, 회원 전화번호
		boolean loginStatus = false; // 로그인 여부
		boolean membershipStatus = false; // 회원가입 여부
		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		boolean run = true;
		boolean run1 = true;

		AAA: while (run) {
			System.out.println("----------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("메뉴 선택: ");
			int num = Integer.parseInt(scanner.nextLine());

			switch (num) {

			case 1:
				if (loginStatus) { // 로그인 여부 확인
					System.out.println("이미 로그인 상태입니다");
					continue; // 밑으로 안내려가고 switch를 빠져나간다
				}
				
				System.out.println("-----로그인하기-----");
				System.out.print("아이디: ");
				String id1 = scanner.nextLine();
				System.out.print("패스워드: ");
				String num2 = scanner.nextLine();
//				int num2 = Integer.parseInt(scanner.nextLine());
				
				if(id1.equals(memberName)) {
					if(num2.equals(memberSSN)) {
						loginStatus = true;
						System.out.println("로그인 성공");
					}else {
						System.out.println("로그인 실패: 패스워드가 틀렸습니다");
					}
					
				}else {
					System.out.println("로그인 실패: 아이디가 틀렸습니다");
				}
				break;

			case 2:
				if(membershipStatus) {
					System.out.println("이미 회원가입 상태입니다");
					System.out.println("회원이름: " + memberName);
					do{
						System.out.println("가입 절차를 계속 진행하시겠습니까? (y/n)");
						String answer = scanner.nextLine();
						
						if(answer.equals("n")||answer.equals("N")) {
							continue AAA;
						}else if(answer.equals("y")||answer.equals("Y")) {
							break;
						}
					}while(true);
				}
				
				System.out.println("-----회원가입하기-----");
				System.out.println("[회원 정보 입력]");
				System.out.print("이름: ");
				memberName = scanner.nextLine();
				System.out.print("주민번호 앞 6자리: ");
				memberSSN = scanner.nextLine();
				System.out.print("전화번호: ");
				memberTel = scanner.nextLine();
				
				System.out.println("[입력한 내용]");
				System.out.println("아이디: " + memberName);
				System.out.println("패스워드: " + memberSSN);
				System.out.println("전화번호: " + memberTel);
				membershipStatus = true;
				
				break;
				
			case 3:
				
				
				if (loginStatus) { // 로그인 여부 확인
					run1 = true;
					
				}else {
					System.out.println("로그인 하시기 바랍니다");
				}
				
				while(run1) {
					System.out.println("---------------------------");
					System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
					System.out.println("---------------------------");
					System.out.print("선택>");
					int number = Integer.parseInt(scanner.nextLine());
					
					switch(number) {
					
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
						run1 = false;
						break;
					}
				} 
				System.out.println("종료");
				break;
				
			case 4:
				run = false;
				break;
				
			}
		}
		scanner.close();
		System.out.println("프로그램 종료");

	}

}
