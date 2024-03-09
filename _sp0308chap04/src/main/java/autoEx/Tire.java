package autoEx;

public class Tire {
	private String position;
	
	public void roll() {
		System.out.print(position+", ");
		System.out.println("바퀴가 돈다.");
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
}
