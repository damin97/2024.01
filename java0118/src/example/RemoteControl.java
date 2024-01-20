package example;

public interface RemoteControl {
	public int MAX_VOLUME = 10; //상수
	public int MIN_VOLUME = 0; //상수
	
	public void turnOn(); //추상 메소드
	public void turnOff(); //추상 메소드
	public void setVolume(int volume); //추상 메소드
}
