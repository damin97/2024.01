package sec01;

class YourClass {
	int x;
}

public class Passing2 {
	
	public static void main(String[] args) {
//		YourClass yc3 = null; // 객체가 생성이 안됨
//		yc3.x = 200; // 객체가 없어서 초기확 안됨
		
		YourClass yc = new YourClass(); //객체 생성(기본 생성자 실행)
		System.out.println("main: " + yc);
		System.out.println("main: " + yc.x);
		method1(yc);
		System.out.println("main: " + yc.x);
//		YourClass yc1 = new YourClass(); //객체 생성(기본 생성자 실행)
//		System.out.println("다른객체: " + yc1);
	}
	
	public static void method1(YourClass yc) {
//		System.out.println("method1: " + yc);
		yc.x = 300;
		return;
	}
}
