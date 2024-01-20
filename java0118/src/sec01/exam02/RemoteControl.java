package sec01.exam02;
//인터페이스는 변수 선언이 되지 않는다. 고정형 값과 상수만 가능하다
// 추상 메소드 쓰기 위해서 사용
public interface RemoteControl {
	public static final int MAX_VOLUME = 10; //가장 긴 형태, 상수
	int MIN_VOLUME = 0; //가장 짧은 형태, 생략 가능
	
	public abstract void turnOn(); //추상 메소드
	void turnOff(); // 추상 메소드인데 생략한 형태
}
