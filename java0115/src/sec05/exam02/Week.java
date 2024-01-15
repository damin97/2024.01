package sec05.exam02;

public class Week { // 상수를 열거 타입처럼 만들 수 있다
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	
	public static void main (String[]args) {
		int day = Week.MONDAY;
		System.out.println(day);
	}
}
