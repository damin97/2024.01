package sec02.exam01;

public class Car {//자동차에 대한 설계

	String company; //필드 선언, 객체의 성격을 지닌다
	String model;
	String color;
	int maxSpeed;
	
	public Car() { //기본 생성자
		System.out.println("Car()");
	}
	
	public Car(String str) { //기본 생성자의 매소드 오버로딩
		company = str;
	}
	
	public Car(String str, String str1) { //기본 생성자의 매소드 오버로딩
		company = str;
		model = str1;
	}
	
	public Car(String company, int maxSpeed) { //기본 생성자의 매소드 오버로딩
		super();
		this.company = company;
		this.maxSpeed = maxSpeed;
	}

	public Car(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}
	
	
}
