package sec01.exam01;

public class Prob1 {
	
	void method(){
		System.out.println("method()");
	}
	void method2() {
		try {
			method();
			return;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("method2()-finally");
		}
	}
	public static void main(String[] args) {
		Prob1 pr = new Prob1();
		pr.method2();
	}

}
