package sec02.exam02;

public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; //Parent parent = new Child();이것과 같은 의미, 부모 방에 주소 값을 넣을수 있다
		
		parent.method1();
		parent.method2();

	}
}
