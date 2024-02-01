package page446;

class MyClass {
	void method() {}
}

public class NullPointException {

	public static void main(String[] args) {
		MyClass mc = null;
		System.out.println(mc);
		mc.method(); // 메모리에 주소가 없어서 찾을 수 없다
		
//		String data = null;
//		System.out.println(data.toString());
		
	}
}
