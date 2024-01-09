package sec02.exam01;

import java.util.Scanner;

public class SmallProject {

	public static void bank(Scanner scanner) {
		boolean run = true;
		int balance = 0;

		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
			int str1 = Integer.parseInt(scanner.nextLine());

			if (str1 == 1) {

				System.out.print("예금액>");
				balance += Integer.parseInt(scanner.nextLine());
				System.out.println();

			} else if (str1 == 2) {

				System.out.print("출금액>");
				balance -= Integer.parseInt(scanner.nextLine());
				System.out.println();

			} else if (str1 == 3) {

				System.out.print("잔고>");
				System.out.println(balance);
				System.out.println();

			} else {
				System.out.println();
				break;
			}

		}

		System.out.println("프로그램 종료");

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("-----회원가입하기-----");

		System.out.println("[회원 정보 입력]");
		System.out.print("이름: ");
		String name = scanner.nextLine();
		System.out.print("주민번호 앞 6자리: ");
		String number = scanner.nextLine();
		int profile_number = Integer.parseInt(number);
		System.out.print("전화번호: ");
		String tel = scanner.nextLine();

		System.out.println("-----로그인하기-----");
		System.out.print("이름: ");
		String input1 = scanner.nextLine();
		System.out.print("주민번호 앞 6자리: ");
		String input2 = scanner.nextLine();
		int pf_num = Integer.parseInt(input2);

		if (input1.equals(name)) {
			if (pf_num == profile_number) {
				System.out.println("로그인 성공");

				bank(scanner);
				
			} else {
				System.out.println("로그인 실패: 패스워드가 틀렸습니다");
			}
		} else {
			System.out.println("로그인 실패: 아이디가 틀렸습니다");
		}

	}

}
