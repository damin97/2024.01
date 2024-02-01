package package408_1;

public class A {
	static int field3;
	class B { // 멤버로 쓰인다
		B() {} //생성자
		int field1;
//		static int field2; //왜 오류? 클래스 B 객체가 생성이 되어야 사용 가능하다
		void method1() {}
//		static mrthod2() {}
	}
	void methodA( ) {
		B b = new B();
		b.field1 =3;
		b.method1();
	}
}
