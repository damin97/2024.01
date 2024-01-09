package sec03.exam01;

public class Variable {

	public static void main(String[] args) {
		int value = 0;;
		System.out.println(value);
		int result = value + 10;
		System.out.println(result);
		
		//자료교환(swap)
		int x =10;
		int y =20;
		
		System.out.printf("x는 %d, y는 %d\n", x, y);
		int temp =x;
		x=y;
		y=temp;
		System.out.printf("x는 %d, y는 %d\n", x, y);
	}

}
 