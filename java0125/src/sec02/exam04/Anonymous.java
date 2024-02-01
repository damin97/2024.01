package sec02.exam04;

public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		Calculatable calc = new Calculatable() {
			
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		int x = calc.sum();
		System.out.println(calc.sum());
	}
	
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.method(10, 10);
	}
}
