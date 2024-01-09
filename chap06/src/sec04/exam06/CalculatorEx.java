package sec04.exam06;

public class CalculatorEx {

	public static void main(String[] args) {
		
		Calculator doit = new Calculator();
		
		double result1 = doit.areaRectangle(10);
		System.out.println("정사각형 넓이: " + result1);
		
		double result2 = doit.areaRectangle(10, 20);
		System.out.println("직사각형 넓이: " + result2);

	}

}
      