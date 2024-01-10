package sec05.exam01;

import java.util.Scanner;

public class Project3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idx = -1;
		boolean login = false;
		boolean run = true;
		boolean run1 = true;
		Account[] acc = new Account[3];
		acc[0] = new Account("김하나", "911224", "010-1234-1234");
		acc[1] = new Account("김두울", "921224", "010-1234-1234");
		acc[2] = new Account("김세엣", "931224", "010-1234-1234");

		while (run) {
			System.out.println("----------------------------------");
			System.out.println("1.로그인 | 2.회원수정 | 3.예금/출금 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			int num = Integer.parseInt(scanner.nextLine());

			switch (num) {
			case 1:
				System.out.println("--로그인 하기--");
				System.out.print("아이디: ");
				String id = scanner.nextLine();
				System.out.print("패스워드: ");
				String pw = scanner.nextLine();
				for (int i = 0; i < acc.length; i++) {
					if (id.equals(acc[i].name)) {
						if (pw.equals(acc[i].ssn)) {
							System.out.println("로그인 성공!");
							idx = i;
							login = true;
							break; 
						} else {
							System.out.println("패스워드가 틀렸습니다");
						}
					} else {
						System.out.println("아이디가 틀렸습니다");
						break;
					}
				}
				break;

			case 2:
				if(login == true) {
				System.out.println("--회원수정 하기--");
				System.out.print("이름: ");
				acc[idx].name = scanner.nextLine();
				System.out.print("주민번호: ");
				acc[idx].ssn = scanner.nextLine();
				System.out.print("전화번호: ");
				acc[idx].tel = scanner.nextLine();
				login = true;
				} else {
					System.out.println("로그인 후 사용하세요");
				}
				break;

			case 3:
				if (!login) {
					System.out.println("로그인 후 사용하세요");
					break;
				}else {
					run1 = true;
				}
				while (run1) {
					
					System.out.println("---------------------------");
					System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
					System.out.println("---------------------------");
					System.out.print("선택> ");
					int num1 = Integer.parseInt(scanner.nextLine());
					switch (num1) {
					case 1:
						System.out.println("예금액: ");
						acc[idx].balance = scanner.nextInt();
					case 2:
						System.out.println("출금액: ");
						acc[idx].balance -= scanner.nextInt();
					case 3:
						System.out.println("잔고: " + acc[idx].balance);
					case 4:
						run1 = false;
						break;
					}
				}
				break;
			case 4:
				System.out.println("프로그램 종료");
				run = false;
				break;

			}
		}

	}

}
