package sec05.exam01;

public class Circle {
	int radius;
	String name;

	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public Circle(int radius) {
		this(radius, "어떤 원");
	}

	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}



	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle(10);
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은: " + area);

		Circle dounut = new Circle(10);
		dounut.radius = 2;
		dounut.name = "자바도넛";
		area = dounut.getArea();
		System.out.println(dounut.name + "의 면적은: " + area);
	}
}
