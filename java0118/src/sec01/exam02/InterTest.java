package sec01.exam02;

public interface InterTest {
	void test(); //추상 메소드
	
	default void test1() { // 기능을 추가하고 싶을 때 많은 자식 클래스들이 다 오버라이딩 할 필요 없게 만든 메소드
		System.out.println("test1()");
	}
	default void test3() {
		test4();
	};
	private void test4() { // 인터페이스 내에서 호출할 용도
		System.out.println("test4()");
	};
	static void test5() { // 객체 생성하고 상관이 없다
		System.out.println("test5()");
	}
}
