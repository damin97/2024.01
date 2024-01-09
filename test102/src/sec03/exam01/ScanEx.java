package sec03.exam01;

import java.util.Scanner;

public class ScanEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData; 
		
		while(true) {
			System.out.print("입력:");
			inputData = scanner.nextLine(); //엔터를 치면 엔터키 값을 제외한 것
			System.out.printf("입력된 문자열:%s\n", inputData);
			if (inputData.equals("q")) {
				System.out.println(inputData.equals("q"));
				break;
			}
		}
		System.out.println("종료");
	}


}
 