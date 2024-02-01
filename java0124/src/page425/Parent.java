package page425;

public class Parent {
	void parentMethod() {};
}
class Child extends Parent {

	@Override
	void parentMethod() {
		// TODO Auto-generated method stub
		super.parentMethod();
	}
	
}

class A {
	void method1(Parent p) {}
	
	void method2() {
		method1(new Child());
	}
	
	
	Parent field = new Parent() {

		@Override
		void parentMethod() { //익명 자식 객체
			// TODO Auto-generated method stub
			super.parentMethod();
		}
		
	}; 
	void method( ) {
		Parent var = new Parent() { //익명 자식 객체

			@Override
			void parentMethod() {
				// TODO Auto-generated method stub
				super.parentMethod();
			} 
		
		};
	}
}
