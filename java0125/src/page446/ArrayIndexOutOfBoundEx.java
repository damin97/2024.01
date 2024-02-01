package page446;

public class ArrayIndexOutOfBoundEx {

	public static void main(String[] args) {
		try {
			String str = args[0];
			String str1 = args[1];
			
			System.out.println(str);
			System.out.println(str1);
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace(); // 에러 메시지 프린트해준다
			System.out.println(e.getMessage());
			System.out.println("예외 발생!");
		}
		
	}

}
