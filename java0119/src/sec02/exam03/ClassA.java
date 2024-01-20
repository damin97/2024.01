package sec02.exam03;
interface InterA {
	void method();
}

class ClassB implements InterA {

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
	
}

public class ClassA extends ClassB {
	public static void main(String[] args) {
		InterA its = new ClassA();
	}
}
