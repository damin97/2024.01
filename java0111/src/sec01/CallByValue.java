package sec01;

public class CallByValue {
	
	public static void increase(int n, MyClass mc) {
		n = n + 1;
		System.out.println(n);
		mc.n += 1;
		System.out.println(mc.n);
	}

	public static void main(String[] args) {
		
		int n = 100;
		MyClass mc = new MyClass();
		System.out.println(mc.n);
//		increase(n, mc); // 101 
		increase(n, new MyClass());
		System.out.println(n); // 100
		System.out.println(mc.n);
	}
}

class MyClass {
	int n;
}
