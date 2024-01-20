package sec03.exam01;

public abstract class Phone {
	int x;

	public Phone(int x) {
		super();
		this.x = x;
	}
	
	public abstract void ring(int tel); //추상 메소드
}
