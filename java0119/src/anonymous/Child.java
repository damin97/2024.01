package anonymous;

class Parent {
	void method() {}
}

public class Child extends Parent{
	
	@Override
	void method() {
		// TODO Auto-generated method stub
		super.method();
	}

	public static void main(String[] args) {
		new Child(); // 익명 객체, 변수가 없는 것
		// 이름이 없으면(변수가 없으면) 다시 부를 수 없다. 다시 사용 불가능
		Parent parent = new Parent() {

			@Override
			void method() {
				// TODO Auto-generated method stub
				super.method();
			}
			
		}; // 자식 객체이다
	}

}
