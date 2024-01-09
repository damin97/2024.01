package chap05;

public class StaticMethod {

	static int y; //정적 필드 (필드는 자동으로 초기화된다)

	public static void main(String[] args) {
		System.out.println(y);
		y = 300;
		int x = 100; //지역변수
		method1(100); // 호출
		System.out.println(x);
	}

	public static void method1(int x) { //매개변수 (일종의 지역변수)
		System.out.println(y);
		System.out.println(x);
		x = 200;
	}

}
