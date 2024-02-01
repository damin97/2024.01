package page409;

public class LocalClass {
	
	void method() {
		class D {
			D(){}
			int field1;
//			static int field2; //static은 사용할 수 없다
			void method1() {}
//			static void method2() {} //static은 사용할 수 없다
		}
		D d = new D();
		d.field1 =3;
		d.method1();
	}
}
