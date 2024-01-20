package sec01.exam02;

public class Ex {

	public static void main(String[] args) {
//		new RemoteControl(); //인터페이스는 객체를 생성 못한다
		
		RemoteControl rc = new Audio();
		rc.turnOn();
		System.out.println(rc.MAX_VOLUME);
//		rc.MAX_VOLUME = 100; // 오류이다. 상수는 고정된 값만 가진다.
	}
}
