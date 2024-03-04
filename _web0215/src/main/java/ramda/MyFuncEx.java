package ramda;

public class MyFuncEx {

	public static void main(String[] args) {
		MyFunc mf = ()->{System.out.println("람다식 실행 문장");};
		mf.aaa();
		
		//밑의 코드와 위의 코드가 같은 의미이다
//		MyFunc mf1 = new MyFunc() {
//			
//			@Override
//			public void aaa() {
//				System.out.println("람다식 실행 문장");
//				
//			}
//		};
//		mf1.aaa();
	}

}
