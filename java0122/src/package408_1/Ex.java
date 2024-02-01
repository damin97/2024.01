package package408_1;

public class Ex {

	public static void main(String[] args) {
//		A a = new A();
//		A.B b = a.new B(); 
		
		//위의 두줄을 한줄로 쓸 수 있다
		A.B b = new A().new B();
		b.field1 = 3;
		b.method1();

	}

}
