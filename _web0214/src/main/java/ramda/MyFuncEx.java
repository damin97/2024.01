package ramda;

public class MyFuncEx {

	public static void main(String[] args) {
		MyFunc mf, mf3;
		
		mf3 = (a)->{System.out.println(a);};//람다식은 메소드 하나만 허용한다. 그래서 이름 형식을 생략. 인터페이스 타입만 가능
		mf3.method(20);
		
		mf = new MyFunc() {
			
			@Override
			public void method(int x) {
				System.out.println(x);
				
			}
		};
		mf.method(10);
		
	}

}
