package package408_2;

public class A {
	static class C { //static 클래스는 다 선언할 수 있다
		C() {}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	void methodA() {
		C.field2 = 10; //위에 선언도 가능. 위치 상관 없음. static 은 객체생성과 상관없이 사용가능
		C c = new C();
		c.field1 = 3;
//		c.field2 = 10;
		C.field2 = 10;
	}
}