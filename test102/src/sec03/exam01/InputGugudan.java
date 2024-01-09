package sec03.exam01;

import java.util.Scanner;

public class InputGugudan {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str;
		
		for(;;) {
			System.out.print("숫자 입력>"); //처리 (UI)
			str = scan.nextLine();
			
			if(str.equals("q")) {
				break;
			}
			int num = Integer.parseInt(str);
			
			for(int i=1; i <=9; i++) {
				
				System.out.printf("%d x %d = %d\n", num, i, num*i);
							
			}
					
		}
		System.out.println("종료");

	}

}
