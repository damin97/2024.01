package page413;

public class A {
	
	public static void main(String[] args) {
		B b = new B();
		b.method();
		A a = new A();
//		B b = a.new B(); // B는 단독으로 사용 불가능. 꼭 A 객체 생성 후 사용 가능
//		B b = new A().new B(); // 위와 같은 의미
		b.method(); // A 객체 생성 후여서 사용 가능
	}
	
	int field1;
	void method1() {
		System.out.println("method1()");
	}
	
	static class B {
		void method() { 
//			field1 = 10;
//			method1();
			System.out.println("method()");
		}
	}
	
}
