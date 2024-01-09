package sec04.exam01;

public class CalEx {

	public static void main(String[] args) {
		Cal.sx = 500;
		Cal cal = new Cal(); //cal 객체를 생성해야 메소드를 사용할 수 있다
		cal.power(); // 메소드
		
		cal.x = 100; // x값 바꾸기
		cal.printX();
		
		Cal cal2 = new Cal();
		System.out.println(cal2.x);
		cal2.power();

	}

}
