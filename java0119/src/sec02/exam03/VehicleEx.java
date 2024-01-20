package sec02.exam03;

import java.util.ArrayList;
import java.util.List;

interface Inter {}

class MyClass{}

class Acc{
	MyClass mc = new MyClass();
	int x;
	String str;
	String method() {
		return str;
	}
}

public class VehicleEx {
	

	public static void main(String[] args) {
		new Bus().checkFare();
		
		Vehicle vehicle = new Bus();
		if(vehicle instanceof Bus) {
			System.out.println("가능");
		}
		
		Bus bus = (Bus) vehicle;
		bus.checkFare();
		
		String str = "테스트";
		String str1 = "";
		for(int i=0; i<100; i++) { //성능 고민 필요?
			str1 += str;
		}
		System.out.println(str1);
		
		List<Acc> list = new ArrayList(); //가변적인 배열
//		list.add(123);
//		list.add("문자열");
//		list.add(3.14);
		list.add(new Acc());
		
		for(Object obj : list) {
			Acc acc = (Acc) obj; //타입의 제약 사항을 받는다 그래서 강제 형변환을 해야한다
			System.out.println(acc);
		}
		
		vehicle.run();
		
		bus.run();
		

	}

}
