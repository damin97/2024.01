package java0116;

class A {
	public A() {
		super();
		System.out.println("생성자A");
	}
}

class B extends A {
	public B() {
		super();
		System.out.println("생성자B");
	}
}

class C extends A {
	public C() {
		super();
		System.out.println("생성자C");
	}
}

public class ConstructorEx {
	C c = new C();
}
