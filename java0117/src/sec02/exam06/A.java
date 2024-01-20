package sec02.exam06;

public class A {
	public static void method(B b) {
		
	}
	
	public static void main(String[] args) {
		method(new B());
		
		B b1 = new B();
		B b3 = new D();
		B b4 = new E();
		
		A a = new A();
		if(a instanceof B) {
			B b = (B)a;
			System.out.println("변환 가능");
		}else {
			System.out.println("변환 불가능");
		}
	}
}
