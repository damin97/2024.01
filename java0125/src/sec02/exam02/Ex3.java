package sec02.exam02;

class AnyClass3 {
	void anyMethod(){
		throw new NullPointerException(); // 예외를 발생 시킨다
	}
	
}

public class Ex3 {
	public static void main(String[] args) {
		AnyClass3 ac = new AnyClass3(); //메소드 사용하려고 객체 생성한다.
		
		try{
			ac.anyMethod();
		} catch(NullPointerException e){
			
		}
		System.out.println("계속 실행");
	}
}
