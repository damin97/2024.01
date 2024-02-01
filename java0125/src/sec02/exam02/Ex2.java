package sec02.exam02;

class AnyClass2 {
	void anyMethod() throws InterruptedException{
		throw new InterruptedException(); // 예외를 발생 시킨다
	}
	
}

public class Ex2 {
	public static void main(String[] args) {
		AnyClass2 ac = new AnyClass2(); //메소드 사용하려고 객체 생성한다.
		try {
			ac.anyMethod();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
