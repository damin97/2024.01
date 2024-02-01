package sec01.exam02;

public class Ex {

	public static void main(String[] args) {
		A.method2(); // A의 객체 생성 없이 사용 가능
		A.B b = A.field3;
		A.C c = A.field4;
		A a = new A();
		a.method1(); //객체 생성 후 가능
		A.B b1 = a.field1;
		A.C c1 = a.field2;
		A.C c2 = new A().field2;

	}

}
