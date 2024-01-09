package sec02.exam01;

import java.util.Scanner;

public class LoginInfo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String id = scanner.nextLine();
		
		System.out.print("패스워드: ");
		String str_pw = scanner.nextLine();
		int pw = Integer.parseInt(str_pw);
		
		if(id.equals("java")) {
			if(pw == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패: 패스워드가 틀렸습니다");
			}
		}else {
			System.out.println("로그인 실패: 아이디가 틀렸습니다");
		}

	}

}
