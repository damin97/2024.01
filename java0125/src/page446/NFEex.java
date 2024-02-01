package page446;

public class NFEex {
	public static void main(String[] args) {
		try {
		int x = Integer.parseInt("aa");
		System.out.println(x);
		}catch(NumberFormatException e) {
			e.printStackTrace(); // 에러 메시지 프린트해준다
			System.out.println(e.getMessage());
			System.out.println("예외 발생!");
		}
		
	}
}
