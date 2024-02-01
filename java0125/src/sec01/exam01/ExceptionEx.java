package sec01.exam01;

class MyClass {
	void method() throws MyException  {
		throw new MyException("나의 예외 상황");
	}
}

public class ExceptionEx {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		try {
			mc.method();
		} catch(MyException e){
			e.printStackTrace();
		}
	}

}
