package package408_2;

public class Ex {

	public static void main(String[] args) {
		A.C.field2 = 3;
		A.C.method2();
		
		A.C c = new A.C(); //바깥 클래스가 static 클래스라는 것을 알 수 있다
		c.field1 = 3;
		c.method1();

	}

}
