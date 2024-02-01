package page416;

public class Outter {
	static String str = "static-str";
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field);
			System.out.println(Outter.this.field);
			System.out.println(field);
			System.out.println(Outter.str);
		}
	}
}
