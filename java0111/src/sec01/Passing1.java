package sec01;

public class Passing1 {
	
	// 지역변수는 그 블럭에서만 생존한다
	public static int method1(int y) { //함수, 메소드
		// y도 지역변수 (단, 호출한 곳에서 값을 넘겨줘야 한다)
		y += 1;
		return y; // 호출을 하면 리턴해야 한다
	}

	public static void main(String[] args) {
		int x = 100; //지역변수: 해당 메소드 내에서만 살아있는 변수
		x = method1(x);

		System.out.println("x값: "+x);
	}

}
