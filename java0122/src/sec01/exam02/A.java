package sec01.exam02;

public class A {
	B field1 = new B();
	C field2 = new C();
	
//	static B field3 = new B(); // A가 객체 생성이 되어야 B도 객체 생성이 된다.
	static B field3 = new A().new B(); // A 객체 생성 후 사용 가능하다.
	static C field4 = new C();
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	static void method2() {
//		B var1 = new B(); // A가 객체 생성이 되어야 B도 객체 생성이 된다.
		C var2 = new C();
		B var1 = new A().new B();
	}
	
	class B {}
	static class C {}
	
}
