package design.pattern;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
//		CarFactory carFactory = new KoreanCarFactory();
		Scanner scanner = new Scanner(System.in);
		CarFactory carFactory = null;
		System.out.print("생산하려는 차종을 선택해주세요(1.국산차 | 2.미국차): ");
		String key = scanner.nextLine();
		switch(key) {
		case "1":
			carFactory = new KoreanCarFactory();
			break;
		case "2":
			carFactory = new StateCarFactory();
			break;
		default:
			System.out.println("다시 선택하세요.");
			break;
		}
		
		TireProduct tireProduct = carFactory.createTire();
		DoorProduct doorProduct = carFactory.createDoor();
		
		String tire = tireProduct.makeAssemble();
		String door = doorProduct.makeAssemble();
		System.out.println(tire);
		System.out.println(door);

	}
}
