package page420;

public class A {
	int x = 10;;
	
	void method(final int x) {
		final String y = "yyy"; //final 생략 되어도 자동으로 final이다.
//		x = 100;
		
		class Inner {
			void method() {
				String z = x + y;
			}
		}
	}
	
	static class B {
		void method() {
//			System.out.println(x);
		}
	}
}
