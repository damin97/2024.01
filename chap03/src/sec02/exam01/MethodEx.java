package sec02.exam01;

public class MethodEx {
	
	public static String input(){ // 선언부분
		return "abc"; // return 은 오직 하나만 가능
		
	}

	public static void main(String[] args) {
		String str = input(); // 실행부분
		System.out.println(str);

	}

}
