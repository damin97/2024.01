package sec02.exam01;

class A{}
class B extends A{}
class C extends A{}

class D extends B{}
class E extends C{}

public class PromoEx {
	public static void main(String[] args) {
		Object obj = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
//		A a1 = new B(); //부모로 변수 선언을 하고 자식으로 객체 생성을 할 수 있다
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e; // 부모로 변수 선언을 하고 자식으로 객체 생성
	}
}
