package sec04.exam06;

public class Calculator {
	//정사각형 넓이
	double areaRectangle(double width) {
		return width*width;
	}
	//직사각형 넓이
	double areaRectangle(double width, double height) {
		return width*height;
	}
	
	public static void main(String[] arg) {
		Calculator cal = new Calculator();
		System.out.println(cal.areaRectangle(11.5));
		System.out.println(cal.areaRectangle(11.5, 5.9));
	}
}
