package sec02.exam02;

class AnyClass {
	void anyMethod() throws Exception {}
	void method() {
		try {
			this.anyMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Ex {
	public static void main(String[] args) {
		AnyClass ac = new AnyClass(); //메소드 사용하려고 객체 생성한다.
		ac.method();
	}
}
